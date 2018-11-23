package com.demo.android_base.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.demo.android_base.R
import com.demo.android_base.demo.adapter.DataContrastOtherAdapter
import com.demo.android_base.demo.entity.DataContrastItemOther0
import com.demo.android_base.demo.entity.DataContrastItemOther1
import com.demo.android_base.demo.entity.DataContrastItemOther2
import kotlinx.android.synthetic.main.activity_data_contrast.*
import java.util.*


/**
 * created by tea9 at 2018/11/22
 */
class DataContrastOtherActivity : AppCompatActivity() {

    internal var list: ArrayList<MultiItemEntity>? = null;
    var adapter:DataContrastOtherAdapter? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_contrast);
        initView();
    }

    private fun initView() {
        rv.layoutManager = LinearLayoutManager(this)
        list = generateData();
        adapter = DataContrastOtherAdapter(list)
        rv.adapter = adapter
        adapter!!.expandAll()
    }

    private fun generateData():ArrayList<MultiItemEntity> {
        val lv0Count = 9
        val lv1Count = 3
        val lv2Count = 5
        val lv3Count = 7

        val nameList = arrayOf("Bob", "Andy", "Lily", "Brown", "Bruce")
        val random = Random()

        val res = ArrayList<MultiItemEntity>()
        for (i in 0 until 1) {
            val lv0 = DataContrastItemOther0("This is " + i + "th item in Level 0")
            for (z in 0 until lv1Count) {
                lv0.addSubItem(DataContrastItemOther0().DataContrastItemOther0Item("zzzz" + z))
            }

            res.add(lv0)
        }
        for (j in 0 until 1) {
            val lv1 = DataContrastItemOther1("Level 1 item: $j")
            for (z in 0 until lv0Count){
                lv1.addSubItem(DataContrastItemOther1().DataContrastItemOther1Item("zzzzz"+z))
            }
            res.add(lv1)
        }
        for (k in 0 until lv2Count) {
            val lv2 = DataContrastItemOther2(nameList[k]+random.nextInt(40))
            for (z in 0 until lv0Count){
                lv2.addSubItem(DataContrastItemOther2().DataContrastItemOther2Item("zzzzz"+z))
            }
            res.add(lv2)
        }
        return res
    }
}