package com.yeungeek.modulea.debug;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.yeungeek.modulea.BuildConfig;

/**
 * @author yangjian
 * @date 2018/09/28
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
            ARouter.printStackTrace();
        }

        ARouter.init(this);
    }
}
