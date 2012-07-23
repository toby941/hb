package com.haobin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.haobin.PullToRefreshListView.OnRefreshListener;

public class NewsActivity extends Activity {
	private PullToRefreshListView vlistView;
	private View backHome;
	private TextView title;
	private TextView content;
	private int hled_menu_i = 0;
	private int last_menu_i = -1;
	private int hled_subt_i = 0;
	private int last_subt_i = -1;

	private int[] idle_menu_icons = {R.drawable.b1, R.drawable.b2,
			R.drawable.b3, R.drawable.b4, R.drawable.b5};
	private int[] hled_menu_icons = {R.drawable.b1_1, R.drawable.b2_2,
			R.drawable.b3_3, R.drawable.b4_4, R.drawable.b5_5};
	private int[] menu_ids = {R.id.m_news, R.id.m_video, R.id.m_image,
			R.id.m_s, R.id.m_vote};
	private String[] menu_texts = {"新闻", "视频", "图片", "专题", "投票"};
	private String[] news_titles = {"副标一", "副标二", "副标三", "副标四", "副标五"};
	private TextView[] tvSubs = null;

	private void initSubTitles(final Context context) {
		LinearLayout ll = (LinearLayout) findViewById(R.id.news_sub);
		tvSubs = new TextView[news_titles.length];
		for (int i = 0; i < news_titles.length; i++) {
			final int j = i;
			TextView tv = tvSubs[i] = new TextView(context);
			if (i == hled_subt_i) {
				tv.setTextColor(Color.WHITE);
			}
			tv.setText(news_titles[i]);
			tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
			tv.setPadding(20, 0, 10, 0);
			LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT, 1);
			tv.setLayoutParams(params);

			tv.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					if (j == hled_subt_i)
						return;
					else {
						last_subt_i = hled_subt_i;
						hled_subt_i = j;
						selectSub(j);
					}
				}
			});

			ll.addView(tv);
		}
	}

	private void intiMenu(final Context context) {
		for (int i = 0; i < menu_ids.length; i++) {
			LinearLayout ll = (LinearLayout) findViewById(menu_ids[i]);
			ll.setOnClickListener(getListener(context));

			TextView tv = new TextView(context);
			tv.setText(menu_texts[i]);
			tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
			tv.setTextColor(Color.WHITE);
			tv.setPadding(0, 0, 0, 2);
			ll.addView(tv);
		}
	}

	private OnClickListener getListener(final Context context) {
		return new OnClickListener() {

			@Override
			public void onClick(View v) {
				for (int i = 0; i < menu_ids.length; i++) {
					if (v.getId() == menu_ids[i]) {
						selectTab(i);
						break;
					}
				}
			}
		};
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);
		initSubTitles(this.getApplicationContext());
		intiMenu(this.getApplicationContext());
		selectTab(0);

		backHome = findViewById(R.id.header_home);
		backHome.setClickable(true);
		backHome.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				NewsActivity.this.finish();
			}
		});
	}

	private final Runnable back2Last = new Runnable() {
		@Override
		public void run() {
			if (last_menu_i > 0 || last_menu_i < menu_ids.length)
				selectTab(last_menu_i);
		}
	};

	private void selectSub(int sub_i) {
		if (sub_i < 0 || sub_i >= news_titles.length)
			return;

		TextView tv = tvSubs[sub_i];
		tv.setTextColor(Color.WHITE);

		if (last_subt_i == -1)
			return;

		tv = tvSubs[last_subt_i];
		tv.setTextColor(Color.GRAY);
	}

	private void selectTab(int tab_i) {
		findViewById(menu_ids[hled_menu_i]).setBackgroundResource(
				idle_menu_icons[hled_menu_i]);
		findViewById(menu_ids[tab_i]).setBackgroundResource(
				hled_menu_icons[tab_i]);

		if (tab_i != 0) {

			vlistView.setAdapter(null);

			// put a toast except news
			// String str = menu_texts[tab_i];
			// Toast.makeText(this, "【" + str + "】精彩功能 敬请期待",
			// Toast.LENGTH_SHORT)
			// .show();

			// last_menu_i = hled_menu_i;
			// Handler h = new Handler();
			// h.postDelayed(back2Last, 2000);

		} else {

			vlistView = (PullToRefreshListView) findViewById(R.id.vlist);

			SimpleAdapter adapter = new SimpleAdapter(this, getData(),
					R.layout.vlist, new String[]{"title", "info", "img"},
					new int[]{R.id.title, R.id.info, R.id.img}) {
				@Override
				public View getView(final int position, View convertView,
						ViewGroup parent) {
					View view = super.getView(position, convertView, parent);
					// if (position % 2 == 0) {
					// view.setBackgroundResource(R.drawable.news_06);
					// }
					return view;
				}
			};

			vlistView.setAdapter(adapter);

			vlistView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					Intent intent = new Intent(NewsActivity.this,
							NewsDetailActivity.class);
					NewsActivity.this.startActivity(intent);

				}
			});

			vlistView.setOnItemSelectedListener(new OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

				}

				@Override
				public void onNothingSelected(AdapterView<?> arg0) {
				}
			});

			vlistView.setOnRefreshListener(new OnRefreshListener() {
				@Override
				public void onRefresh() {
					// Do work to refresh the list here.
					new GetDataTask().execute();
				}
			});
		}

		hled_menu_i = tab_i;
	}
	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "G12峰会胡锦涛弯腰拾起国旗");
		map.put("info", "图片拍的是在G20峰会上，主办方用贴在地板上的各国国旗来标示合影时领导人的位置。合影结束后，惟有中");
		map.put("img", R.drawable.news_18);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "美最大核潜艇驶入日军港");
		map.put("info", "据日本新闻网报道，美国海军一艘最大的核动力潜艇时隔两年再度驶入日本神奈川县的横须贺军港");
		map.put("img", R.drawable.news_19);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "神州九罕见生活照曝光");
		map.put("info", "神九航天员刘旺与妻子女儿合影。刘洋与师兄比赛输了罚做俯卧撑。神九航天员刘洋与爱人在一起。");
		map.put("img", R.drawable.news_20);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "黄河小浪底实施汛前调水调沙");
		map.put("info", "黄河2012年汛前调水调沙6月19日开始运行，历时约20天，黄河防总联合调度万家寨、三门峡");
		map.put("img", R.drawable.news_21);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "南科大招生复试题似测智商");
		map.put("info", "备受关注的南方科技大学自主招生能力测试（复试）昨日上午在全国八省同时开考，近1400名考生参加，");
		map.put("img", R.drawable.news_22);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.news_23);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.news_22);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.news_22);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.news_22);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.news_22);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.news_22);
		list.add(map);
		return list;
	}

	private class GetDataTask extends AsyncTask<Void, Void, String[]> {

		@Override
		protected String[] doInBackground(Void... params) {
			// Simulates a background job.
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				;
			}
			return new String[]{"return"};
		}

		@Override
		protected void onPostExecute(String[] result) {

			// Call onRefreshComplete when the list has been refreshed.
			vlistView.onRefreshComplete();
			// Toast.makeText(NewsActivity.this.getApplication(), "已经是最新",
			// 500).show();
			// super.onPostExecute(result);
		}
	}
}
