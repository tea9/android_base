package com.demo.android_base.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.demo.android_base.R
import com.demo.android_base.demo.adapter.DataContrastAdapter
import com.demo.android_base.demo.entity.DataContrastItem0
import com.demo.android_base.demo.entity.DataContrastItem1
import com.demo.android_base.demo.entity.DataContrastItem2
import com.demo.android_base.demo.entity.DataContrastItem3
import kotlinx.android.synthetic.main.activity_data_contrast.*
import java.util.*


/**
 * created by tea9 at 2018/11/22
 */
class DataContrastActivity : AppCompatActivity() {

    internal var list: ArrayList<MultiItemEntity>? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_contrast);
        initView();
    }

    private fun initView() {
        rv.layoutManager = LinearLayoutManager(this)
        list = generateData();
        rv.adapter = DataContrastAdapter(list)
    }

    private fun generateData():ArrayList<MultiItemEntity> {
        val lv0Count = 9
        val lv1Count = 3
        val lv2Count = 5
        val lv3Count = 7

        val nameList = arrayOf("Bob", "Andy", "Lily", "Brown", "Bruce")
        val random = Random()

        val res = ArrayList<MultiItemEntity>()
        for (i in 0 until lv0Count) {
            val lv0 = DataContrastItem0("This is " + i + "th item in Level 0")
            for (z in 0 until lv1Count){
                lv0.addSubItem("zzzzz"+z)
            }

            res.add(lv0)
        }
        for (j in 0 until lv1Count) {
            val lv1 = DataContrastItem1("Level 1 item: $j")
            res.add(lv1)
        }
        for (k in 0 until lv2Count) {
            val lv2 = DataContrastItem2(nameList[k]+random.nextInt(40))
            res.add(lv2)
        }
        for (l in 0 until lv3Count) {
            val lv3 = DataContrastItem3("lv3"+l)
            res.add(lv3)
        }
        res.add(DataContrastItem0("This is " + lv0Count + "th item in Level 0"))
        return res
    }
}