package com.doryu.charactersheet;

import android.app.Application;
import android.content.Context;

public class CharacterSheetApplication extends Application {
    private static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
    }

    public static Context getAppContext() {
        return sAppContext;
    }
}
