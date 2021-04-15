package com.learning.toutiao;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.learning.yunmusicadapter.R;

public class TouTiaoActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //头条方式是通过修改density来实现适配的
        //需要写在setContentView之前
        //不过这样写太麻烦，每个Activity都要设置，我们可以在BaseActivity中去写，或者在Application中监听Activity的创建
        //Density.setDensity(getApplication(),this);

        setContentView(R.layout.activity_toutiao);


    }
}
