package com.learning.wangyi;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.learning.yunmusicadapter.R;

public class WangYiActivity extends AppCompatActivity {

    private TextView mTvTool1;
    private TextView mTvTool2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wangyi);

        mTvTool1 = (TextView) findViewById(R.id.tv_tool1);
        mTvTool2 = (TextView) findViewById(R.id.tv_tool2);

        //通过工具类进行适配
        ViewCalculateUtil.setViewLinearLayoutParam(mTvTool1,1080, LinearLayout.LayoutParams.WRAP_CONTENT,0,0,0,0);
        ViewCalculateUtil.setViewLinearLayoutParam(mTvTool2,540, LinearLayout.LayoutParams.WRAP_CONTENT,0,0,0,0);
    }
}
