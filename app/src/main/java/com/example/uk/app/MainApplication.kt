package com.example.uk.app

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.example.uk.BuildConfig

class MainApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            //开启日志
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}