package com.demo.android_base.demo.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.demo.adapter.DataContrastAdapter;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastItem2 implements MultiItemEntity {

    public String text;

    public DataContrastItem2(String text) {
        this.text = text;
    }

    @Override
    public int getItemType() {
        return DataContrastAdapter.ITEM_2;
    }
}
