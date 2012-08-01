/*******************************************************************************
 * Copyright 2011, 2012 Chris Banes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.handmark.pulltorefresh.samples;

import java.util.Arrays;
import java.util.LinkedList;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

public class PullToRefreshListActivity extends ListActivity {

	static final int MENU_MANUAL_REFRESH = 0;
	static final int MENU_DISABLE_SCROLL = 1;
	static final int MENU_SET_MODE = 2;

	private LinkedList<String> mListItems;
	private PullToRefreshListView mPullRefreshListView;
	private ArrayAdapter<String> mAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pull_to_refresh_list);

		mPullRefreshListView = (PullToRefreshListView) findViewById(R.id.pull_refresh_list);

		// Set a listener to be invoked when the list should be refreshed.
		mPullRefreshListView.setOnRefreshListener(new OnRefreshListener() {
			@Override
			public void onRefresh() {
				mPullRefreshListView.setLastUpdatedLabel(DateUtils.formatDateTime(getApplicationContext(),
						System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE
								| DateUtils.FORMAT_ABBREV_ALL));

				// Do work to refresh the list here.
				new GetDataTask().execute();
			}
		});

		ListView actualListView = mPullRefreshListView.getRefreshableView();

		mListItems = new LinkedList<String>();
		mListItems.addAll(Arrays.asList(mStrings));

		mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListItems);

		// You can also just use setListAdapter(mAdapter)
		actualListView.setAdapter(mAdapter);
	}

	private class GetDataTask extends AsyncTask<Void, Void, String[]> {

		@Override
		protected String[] doInBackground(Void... params) {
			// Simulates a background job.
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
			}
			return mStrings;
		}

		@Override
		protected void onPostExecute(String[] result) {
			mListItems.addFirst("Added after refresh...");
			mAdapter.notifyDataSetChanged();

			// Call onRefreshComplete when the list has been refreshed.
			mPullRefreshListView.onRefreshComplete();

			super.onPostExecute(result);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_MANUAL_REFRESH, 0, "Manual Refresh");
		menu.add(0, MENU_DISABLE_SCROLL, 1,
				mPullRefreshListView.isDisableScrollingWhileRefreshing() ? "Enable Scrolling while Refreshing"
						: "Disable Scrolling while Refreshing");
		menu.add(0, MENU_SET_MODE, 0,
				mPullRefreshListView.getMode() == Mode.BOTH ? "Change to MODE_PULL_DOWN"
						: "Change to MODE_PULL_BOTH");
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		MenuItem disableItem = menu.findItem(MENU_DISABLE_SCROLL);
		disableItem
				.setTitle(mPullRefreshListView.isDisableScrollingWhileRefreshing() ? "Enable Scrolling while Refreshing"
						: "Disable Scrolling while Refreshing");

		MenuItem setModeItem = menu.findItem(MENU_SET_MODE);
		setModeItem.setTitle(mPullRefreshListView.getMode() == Mode.BOTH ? "Change to MODE_PULL_DOWN"
				: "Change to MODE_PULL_BOTH");

		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
			case MENU_MANUAL_REFRESH:
				new GetDataTask().execute();
				mPullRefreshListView.setRefreshing(false);
				break;
			case MENU_DISABLE_SCROLL:
				mPullRefreshListView.setDisableScrollingWhileRefreshing(!mPullRefreshListView
						.isDisableScrollingWhileRefreshing());
				break;
			case MENU_SET_MODE:
				mPullRefreshListView
						.setMode(mPullRefreshListView.getMode() == Mode.BOTH ? Mode.PULL_DOWN_TO_REFRESH
								: Mode.BOTH);
				break;
		}

		return super.onOptionsItemSelected(item);
	}

	private String[] mStrings = { "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
			"Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale", "Aisy Cendre",
			"Allgauer Emmentaler", "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
			"Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale", "Aisy Cendre",
			"Allgauer Emmentaler" };
}
