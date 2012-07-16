package com.haobin;

import android.app.Activity;
import android.os.Bundle;
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
        // overridePendingTransition(R.anim.in_from_right, R.anim.out_to_right);
        back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                NewsDetailActivity.this.finish();
                // overridePendingTransition(R.anim.in_from_right,
                // R.anim.out_to_right);
            }
        });

    }
}
