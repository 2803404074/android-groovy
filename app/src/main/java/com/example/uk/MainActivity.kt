package com.example.uk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/main/MainActivity")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvBut).setOnClickListener {

            // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
            ARouter.getInstance().build("/test/loginActivity").navigation()

//            // 2. 跳转并携带参数
//            ARouter.getInstance().build("/test/loginActivity")
//                .withLong("key1", 666L)
//                .withString("key3", "888")
//                .navigation()
        }
    }
}