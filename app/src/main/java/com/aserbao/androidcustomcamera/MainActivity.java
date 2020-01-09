package com.aserbao.androidcustomcamera;

import com.aserbao.androidcustomcamera.base.activity.RVBaseActivity;
import com.aserbao.androidcustomcamera.base.beans.ClassBean;
import com.aserbao.androidcustomcamera.blocks.BlocksActivity;
import com.aserbao.androidcustomcamera.whole.WholeActivity;

import java.util.List;

public class MainActivity extends RVBaseActivity {
    @Override
    public List<ClassBean> initData() {
        mClassBeans.add(new ClassBean("Separate code implementation for each function point", BlocksActivity.class));
        mClassBeans.add(new ClassBean("All function points integrated code implementation", WholeActivity.class));
        return mClassBeans;
    }
}
