package com.demo.android_base

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.demo.android_base.base.activity.ExpandableUseActivity
import com.demo.android_base.demo.activity.DataContrastActivity
import com.demo.android_base.demo.activity.DataContrastOtherActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btn1 -> startActivity(Intent(this,ExpandableUseActivity::class.java))
            R.id.btn2 -> startActivity(Intent(this,DataContrastActivity::class.java))
            R.id.btn3 -> startActivity(Intent(this,DataContrastOtherActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
    }
}
