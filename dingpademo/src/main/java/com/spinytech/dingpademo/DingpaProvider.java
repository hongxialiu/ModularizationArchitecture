package com.spinytech.dingpademo;

import com.spinytech.macore.MaProvider;

/**
 * Created by liuhongxia on 2017/3/31.
 */

public class DingpaProvider extends MaProvider {

    @Override
    protected void registerActions() {
        registerAction("dingpa",new DingpaAction());
    }
}
