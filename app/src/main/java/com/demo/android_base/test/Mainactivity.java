package com.demo.android_base.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;

/**
 * created by tea9 at 2018/11/23
 */
public class Mainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Runtime.getRuntime().exec("命令");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
