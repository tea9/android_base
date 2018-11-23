package com.demo.android_base.base.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.base.adapter.ExpandableItemAdapter;


/**
 * created by tea9 at 2018/11/22
 */
public class Level1Item implements MultiItemEntity {

    public String name;

    public Level1Item(String name){
        this.name = name;
    }

    @Override
    public int getItemType() {
        return ExpandableItemAdapter.TYPE_LEVEL_1;
    }
}
