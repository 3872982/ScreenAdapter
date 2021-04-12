package com.learning.yunmusicadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.learning.toutiao.TouTiaoActivity;
import com.learning.wangyi.WangYiActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_wangyi:
                goActivity(WangYiActivity.class);
                break;
            case R.id.btn_toutiao:
                goActivity(TouTiaoActivity.class);
                break;
        }
    }

    public void goActivity(Class<?> cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }
}