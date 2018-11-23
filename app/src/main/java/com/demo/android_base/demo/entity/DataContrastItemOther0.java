package com.demo.android_base.demo.entity;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.demo.adapter.DataContrastOtherAdapter;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastItemOther0 extends AbstractExpandableItem<DataContrastItemOther0.DataContrastItemOther0Item> implements MultiItemEntity {

    public String text;

//    private List<String> list;
    public DataContrastItemOther0(){}

    public DataContrastItemOther0(String text) {
        this.text = text;
//        this.list = list;
    }

    @Override
    public int getItemType() {
        return DataContrastOtherAdapter.ITEM_0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    public class DataContrastItemOther0Item implements MultiItemEntity{

        public String text;

        public DataContrastItemOther0Item(String text){
            this.text = text;
        }


        @Override
        public int getItemType() {
            return DataContrastOtherAdapter.ITEM_0_HEAD;
        }
    }

}
