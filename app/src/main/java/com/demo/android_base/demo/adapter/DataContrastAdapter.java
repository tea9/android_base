package com.demo.android_base.demo.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.R;
import com.demo.android_base.demo.entity.DataContrastItem0;
import com.demo.android_base.demo.entity.DataContrastItem1;
import com.demo.android_base.demo.entity.DataContrastItem2;
import com.demo.android_base.demo.util.GridDivider;

import java.util.List;

/**
 * created by tea9 at 2018/11/22
 */
public class DataContrastAdapter  extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    public static final int ITEM_0 = 0;
    public static final int ITEM_1 = 1;
    public static final int ITEM_2 = 2;
    public static final int ITEM_3 = 3;

    public DataContrastAdapter(List<MultiItemEntity> data) {
        super(data);
        addItemType(ITEM_0,R.layout.item_data_contrast_lv0);
        addItemType(ITEM_1,R.layout.item_data_contrast_lv1);
        addItemType(ITEM_2,R.layout.item_data_contrast_lv2);
//        addItemType(ITEM_3,R.layout.item_data_contrast_lv3);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case ITEM_0:
                final DataContrastItem0 lv0 = (DataContrastItem0) item;
                final RecyclerView rv = helper.getView(R.id.rv);
                List<String> list = lv0.getSubItems();
                rv.setLayoutManager(new LinearLayoutManager(helper.itemView.getContext()));
                rv.setHasFixedSize(true);
                BaseQuickAdapter adapter0 =new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_data_contrast_lv0_block,list) {
                    @Override
                    protected void convert(BaseViewHolder helper, String item) {
                        helper.setText(R.id.tv1,item+1);
                        helper.setText(R.id.tv2,item+1);
                        helper.setText(R.id.tv3,item+1);
                    }
                };
                rv.setAdapter(adapter0);
                View view = ((Activity)helper.itemView.getContext()).getLayoutInflater().inflate(R.layout.item_data_contrast_lv0_head, (ViewGroup) rv.getParent(), false);
                adapter0.addHeaderView(view);
                break;
            case ITEM_1:
                final DataContrastItem1 lv1 = (DataContrastItem1) item;
                final RecyclerView rv1 = helper.getView(R.id.rv);
                List<String> list1 = lv1.getSubItems();
                rv1.setLayoutManager(new LinearLayoutManager(helper.itemView.getContext()));
                rv1.setHasFixedSize(true);
                rv1.setAdapter(new BaseQuickAdapter<String,BaseViewHolder>(R.layout.item_data_contrast_lv1_block,list1) {

                    @Override
                    protected void convert(BaseViewHolder helper, String item) {
                        helper.setText(R.id.tv1,item);
                    }
                });
                break;
            case ITEM_2:
                final DataContrastItem2 lv2 = (DataContrastItem2) item;
                final RecyclerView rv2 = helper.getView(R.id.rv);
                final List<String> list2 = lv2.getSubItems();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(helper.itemView.getContext(),2);
                rv2.addItemDecoration(new GridDivider(helper.itemView.getContext(), 1, helper.itemView.getContext().getResources().getColor(R.color.colorAccent)));
//                rv2.addItemDecoration(new GridDivider(helper.itemView.getContext()));
                rv2.setLayoutManager(gridLayoutManager);
                rv2.setAdapter(new BaseQuickAdapter(R.layout.item_data_contrast_lv2_block,list2) {
                    @Override
                    protected void convert(BaseViewHolder helper, Object item) {

                    }

                    @Override
                    public void onBindViewHolder(@NonNull BaseViewHolder holder, int i) {
                        TextView textView = holder.getView(R.id.tv1);
                        if (i%2==0) {
                            textView.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
                        } else {
                            textView.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
                        }
                        holder.setText(R.id.tv1,list2.get(i));
                    }
                });
                break;
        }
    }
}
