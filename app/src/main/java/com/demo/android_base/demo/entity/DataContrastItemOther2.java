package com.demo.android_base.demo.entity;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.demo.adapter.DataContrastOtherAdapter;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastItemOther2 extends AbstractExpandableItem<DataContrastItemOther2.DataContrastItemOther2Item> implements MultiItemEntity {

    public String text;

//    private List<String> list;

    public DataContrastItemOther2() {}

    public DataContrastItemOther2(String text) {
        this.text = text;
//        this.list = list;
    }

    @Override
    public int getItemType() {
        return DataContrastOtherAdapter.ITEM_2;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    public class DataContrastItemOther2Item implements MultiItemEntity{

        public String text;

        public DataContrastItemOther2Item(String text){
            this.text = text;
        }


        @Override
        public int getItemType() {
            return DataContrastOtherAdapter.ITEM_2_HEAD;
        }
    }

}
