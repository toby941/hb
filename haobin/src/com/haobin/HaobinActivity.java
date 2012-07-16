package com.haobin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class HaobinActivity extends Activity {

    private GridView gv;
    private DisplayMetrics dm;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Constants.setDisplay(getWindowManager());
        setContentView(R.layout.main);
        // 通过findViewById方法获得GridView对象
        gv = (GridView) findViewById(R.id.gridView01);
        // 设置GridView的行数
        gv.setNumColumns(4);
        gv.setAdapter(new MyAdapter(this));
    }
    // 自定义适配器
    class MyAdapter extends BaseAdapter {
        // 图片id数组
        private final Integer[] imgs = { R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3, R.drawable.icon_4, R.drawable.icon_5, R.drawable.icon_6,
                R.drawable.icon_7 };
        private final Integer[] imgs_text = { R.string.icon1, R.string.icon2, R.string.icon3, R.string.icon4, R.string.icon5, R.string.icon6, R.string.icon7 };
        // 上下文对象
        Context context;

        // 构造方法
        MyAdapter(Context context) {
            this.context = context;
        }

        // 获得数量
        public int getCount() {
            return 7;
        }

        // 获得当前选项
        public Object getItem(int item) {
            return item;
        }

        // 获得当前选项id
        public long getItemId(int id) {
            return id;
        }

        // 创建View方法
        public View getView(int position, View convertView, ViewGroup parent) {
            IconViewLayout iconViewLayout = null;
            int index = position;
            if (convertView == null) {
                // 实例化ImageView对象
                iconViewLayout = new IconViewLayout(context, imgs[index], imgs_text[index], NewsActivity.class);
                // 设置ImageView对象布局
                iconViewLayout.setLayoutParams(new GridView.LayoutParams(Constants.getIconWidth(), Constants.getIconHeight()));
                // 设置边界对齐
                // 设置刻度类型
                // imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                // 设置间距
                iconViewLayout.setPadding(8, 8, 8, 8);
            } else {
                iconViewLayout = (IconViewLayout) convertView;
            }
            // 为ImageView设置图片资源
            return iconViewLayout;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            this.showTips();
            return false;
        }
        return false;
    }

    private void showTips() {
        AlertDialog alertDialog =
                new AlertDialog.Builder(HaobinActivity.this).setTitle("提示").setMessage("是否退出濠滨网？")
                        .setPositiveButton("确定", new android.content.DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                HaobinActivity.this.finish();
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                return;
                            }
                        }).create();
        alertDialog.show();
    }
}
