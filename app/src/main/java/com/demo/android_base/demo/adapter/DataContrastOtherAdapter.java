package com.demo.android_base.demo.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.R;
import com.demo.android_base.demo.entity.DataContrastItemOther0;

import java.util.List;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastOtherAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    public static final int ITEM_0_HEAD = 3;
    public static final int ITEM_0 = 0;
    public static final int ITEM_1_HEAD = 4;
    public static final int ITEM_1 = 1;
    public static final int ITEM_2_HEAD = 5;
    public static final int ITEM_2 = 2;


    public DataContrastOtherAdapter(List<MultiItemEntity> data) {
        super(data);
        addItemType(ITEM_0_HEAD,R.layout.item_data_contrast_lv0_block);
        addItemType(ITEM_1_HEAD,R.layout.item_data_contrast_lv1_block);
        addItemType(ITEM_2_HEAD,R.layout.item_data_contrast_lv2_block);
        addItemType(ITEM_0,R.layout.item_data_contrast_lv0_head);
        addItemType(ITEM_1,R.layout.item_data_contrast_lv1_head);
        addItemType(ITEM_2,R.layout.item_data_contrast_lv2_head);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {

        switch (helper.getItemViewType()) {
            case ITEM_0:
                DataContrastItemOther0 item0 = (DataContrastItemOther0) item;
                helper.setText(R.id.tv1,item0.text);
                break;
            case ITEM_0_HEAD:
                DataContrastItemOther0.DataContrastItemOther0Item item0_head = (DataContrastItemOther0.DataContrastItemOther0Item) item;
                helper.setText(R.id.tv1,item0_head.text);
                break;
            case ITEM_1:

                break;
            case ITEM_1_HEAD:
                break;
            case ITEM_2_HEAD:
                break;
            case ITEM_2:
                break;
        }
    }
}
