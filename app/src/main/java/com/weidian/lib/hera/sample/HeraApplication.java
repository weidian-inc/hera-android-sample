package com.weidian.lib.hera.sample;

import android.app.Application;

import com.weidian.lib.hera.config.HeraConfig;
import com.weidian.lib.hera.main.HeraService;

public class HeraApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化框架配置，启动框架服务进程
        HeraConfig config = new HeraConfig.Builder()
                .setHostApiDispatcher(new HostApiDispatcher(this))
                .setDebug(true)
                .build();
        HeraService.start(this.getApplicationContext(), config);
    }
}
