package com.ingdanielpadilla.classtest;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Laboratorio on 20/10/2015.
 */
public class parseinit  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "KtKEptfty8kqCs7qadWmZIXwUYlA7Ki8bpuWhLgw", "c1N5sNbqzrfPXdG8hUKdGXvGkHs7h4eTW06Y2fH5");
    }
}
