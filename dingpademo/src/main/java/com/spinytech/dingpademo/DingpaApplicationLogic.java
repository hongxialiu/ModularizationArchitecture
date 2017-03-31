package com.spinytech.dingpademo;


import com.spinytech.macore.multiprocess.BaseApplicationLogic;
import com.spinytech.macore.router.LocalRouter;

/**
 * Created by liuhongxia on 2017/3/31.
 */

public class DingpaApplicationLogic extends BaseApplicationLogic {
    @Override
    public void onCreate() {
        // 注册Provider，详见2.4
        LocalRouter.getInstance(mApplication).registerProvider("dingpa",new DingpaProvider());
    }
}
