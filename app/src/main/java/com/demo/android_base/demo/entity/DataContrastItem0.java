package com.demo.android_base.demo.entity;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.demo.adapter.DataContrastAdapter;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastItem0 extends AbstractExpandableItem<String> implements MultiItemEntity {

    public String text;

//    private List<String> list;

    public DataContrastItem0(String text) {
        this.text = text;
//        this.list = list;
    }

    @Override
    public int getItemType() {
        return DataContrastAdapter.ITEM_0;
    }

    @Override
    public int getLevel() {
        return 0;
    }
}
