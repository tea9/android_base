package com.demo.android_base.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.demo.android_base.R
import kotlinx.android.synthetic.main.activity_all_classify.*

/**
 * created by tea9 at 2018/12/20
 * 全部分类页面
 */
class AllClassifyActivity:AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
         when (p0!!.id){
             R.id.admin->{

             }
         }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_classify)

        admin.setOnClickListener(this)

        var adapter = object : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_rv_classify) {
            override fun convert(helper: BaseViewHolder?, item: String?) {

            }

        }


    }
}