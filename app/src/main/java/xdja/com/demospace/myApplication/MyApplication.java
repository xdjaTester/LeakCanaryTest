package xdja.com.demospace.myApplication;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import com.squareup.leakcanary.internal.DisplayLeakActivity;
import com.squareup.leakcanary.LeakCanary;

import android.app.Application;

/**
 * Created by zlw on 2016/12/7.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
LeakCanaryInternals.setEnabled(this, DisplayLeakActivity.class, false);
LeakCanary.install(this);
    }
}
