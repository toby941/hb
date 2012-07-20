package com.haobin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.haobin.PullToRefreshListView.OnRefreshListener;

public class NewsActivity extends Activity {
	private PullToRefreshListView vlistView;
	private View backHome;
	private TextView title;
	private TextView content;

	public void intiMenu(final Context context) {
		View video = findViewById(R.id.m_video);
		video.setOnClickListener(getListener(context, "视频"));
		View image = findViewById(R.id.m_image);
		image.setOnClickListener(getListener(context, "图片"));
		View s = findViewById(R.id.m_s);
		s.setOnClickListener(getListener(context, "专题"));
		View vote = findViewById(R.id.m_vote);
		vote.setOnClickListener(getListener(context, "投票"));
	}

	public OnClickListener getListener(final Context context, final String str) {
		return new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(context, "【" + str + "】精彩功能 敬请期待", 500).show();

			}
		};
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);
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

		backHome = findViewById(R.id.header_home);
		backHome.setClickable(true);
		backHome.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				NewsActivity.this.finish();
			}
		});
		// NewsActivity.this.overridePendingTransition(R.anim.in_from_right,
		// R.anim.out_to_right);
		vlistView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
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
		intiMenu(this.getApplicationContext());
		vlistView.setOnRefreshListener(new OnRefreshListener() {
			@Override
			public void onRefresh() {
				// Do work to refresh the list here.
				new GetDataTask().execute();
			}
		});
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
