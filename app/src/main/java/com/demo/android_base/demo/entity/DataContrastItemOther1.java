package com.demo.android_base.demo.entity;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.demo.adapter.DataContrastOtherAdapter;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastItemOther1 extends AbstractExpandableItem<DataContrastItemOther1.DataContrastItemOther1Item> implements MultiItemEntity {

    public String text;

//    private List<String> list;

    public DataContrastItemOther1() {}

    public DataContrastItemOther1(String text) {
        this.text = text;
//        this.list = list;
    }

    @Override
    public int getItemType() {
        return DataContrastOtherAdapter.ITEM_1;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    public class DataContrastItemOther1Item implements MultiItemEntity{

        public String text;

        public DataContrastItemOther1Item(String text){
            this.text = text;
        }


        @Override
        public int getItemType() {
            return DataContrastOtherAdapter.ITEM_1_HEAD;
        }
    }

}
