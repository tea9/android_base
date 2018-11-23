package com.demo.android_base.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.demo.android_base.R;
import com.demo.android_base.base.adapter.ExpandableItemAdapter;
import com.demo.android_base.base.entity.Level0Item;
import com.demo.android_base.base.entity.Level1Item;

import java.util.ArrayList;

/**
 * created by tea9 at 2018/11/22
 */
public class ExpandableUseActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ExpandableItemAdapter adapter;
    private ArrayList<MultiItemEntity> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_item_use);

        rv = findViewById(R.id.rv);
        list = generateData();
        adapter = new ExpandableItemAdapter(list);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter.expandAll();
    }

    private ArrayList<MultiItemEntity> generateData() {
        int lv0Count = 9;
        int lv1Count = 5;
        ArrayList<MultiItemEntity> res = new ArrayList<>();
        for (int i = 0; i < lv0Count; i++) {
            Level0Item lv0 = new Level0Item("父布局"+i,"父布局aaaa"+i);
            for (int j = 0; j < lv1Count; j++) {
                Level1Item lv1 = new Level1Item("子布局sss"+j);
                lv0.addSubItem(lv1);
            }
            res.add(lv0);
        }
        res.add(new Level0Item("shaomaio","zzzz"));
        return res;
    }
    private ArrayList<MultiItemEntity> generateData1() {
        int lv0Count = 9;
        int lv1Count = 5;
        ArrayList<MultiItemEntity> res = new ArrayList<>();
        for (int i = 0; i < lv0Count; i++) {
            Level0Item lv0 = new Level0Item("父布局"+i,"父布局aaaa"+i);
            res.add(lv0);
        }
        for (int j = 0; j < lv1Count; j++) {
            Level1Item lv1 = new Level1Item("子布局sss"+j);
            res.add(lv1);
        }
        res.add(new Level0Item("shaomaio","zzzz"));
        res.add(new Level1Item("shaomaio"));
        return res;
    }
}
