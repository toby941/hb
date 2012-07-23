package com.haobin;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

//自定义ImageButton，模拟ImageButton，并在其下方显示文字 
//提供Button的部分接口 
public class IconViewLayout extends LinearLayout {

	private Context context;

	public IconViewLayout(final Context context, int imageResId, int textResId,
			final Class intentClass) {
		super(context);
		mButtonImage = new ImageView(context);
		LinearLayout.LayoutParams imageLayoutParams = new LinearLayout.LayoutParams(
				Constants.getIconImageWidth(), Constants.getIconImageHeight());
		imageLayoutParams.gravity = Gravity.CENTER;
		mButtonImage.setLayoutParams(imageLayoutParams);
		mButtonText = new TextView(context);
		setImageResource(imageResId);
		// mButtonImage.setPadding(0, 0, 0, 0);
		setText(textResId);
		setTextColor(0xFF000000);
		markId = textResId;
		mButtonText.setPadding(0, 0, 0, 0);
		mButtonText.setGravity(Gravity.CENTER);
		mButtonText.setTextSize(16);

		// 设置本布局的属性
		setClickable(true); // 可点击
		setFocusable(true); // 可聚焦
		// setBackgroundResource(android.R.drawable.btn_default); // 布局才用普通按钮的背景
		setOrientation(LinearLayout.VERTICAL); // 垂直布局
		// 首先添加Image，然后才添加Text
		// 添加顺序将会影响布局效果
		addView(mButtonImage);
		addView(mButtonText);
		setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				IconViewLayout layout = (IconViewLayout) view;
				if (layout.getMarkId().equals(R.string.icon2)) {
					Intent intent = new Intent(
							IconViewLayout.this.getContext(), intentClass);
					IconViewLayout.this.getContext().startActivity(intent);
				} else {
					Toast.makeText(
							context,
							"【" + context.getString(layout.getMarkId()) + "】"
									+ "精彩功能 敬请期待", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	// ----------------public method-----------------------------
	/*
	 * setImageResource方法
	 */
	public void setImageResource(int resId) {
		mButtonImage.setImageResource(resId);
	}

	/*
	 * setText方法
	 */
	public void setText(int resId) {
		mButtonText.setText(resId);
	}

	public void setText(CharSequence buttonText) {
		mButtonText.setText(buttonText);
	}

	/*
	 * setTextColor方法
	 */
	public void setTextColor(int color) {
		mButtonText.setTextColor(color);
	}

	public TextView getmButtonText() {
		return mButtonText;
	}

	// ----------------private attribute-----------------------------
	private ImageView mButtonImage = null;
	private TextView mButtonText = null;
	private Integer markId;

	public Integer getMarkId() {
		return markId;
	}

	public void setMarkId(Integer markId) {
		this.markId = markId;
	}
}
