package com.haobin;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class NewsDetailActivity extends Activity {
	private ImageView back;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_detial);
		back = (ImageView) findViewById(R.id.d_back);
		// overridePendingTransition(R.anim.in_from_right, R.anim.stay_still);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				NewsDetailActivity.this.finish();
				// overridePendingTransition(R.anim.stay_still,
				// R.anim.out_to_right);
			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			NewsDetailActivity.this.finish();
			// overridePendingTransition(R.anim.stay_still,
			// R.anim.out_to_right);
			return true;
		}
		return false;
	}
}
