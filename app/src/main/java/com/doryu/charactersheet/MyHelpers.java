package com.doryu.charactersheet;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Drew Arch on 2015-06-09.
 */
public class MyHelpers {

    public static Point getWindowDimensions(Context context) {
        //Sets window height
        Activity activity = (Activity) context;
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }

    public static int getUsableHeight(Context context) {
        Activity activity = (Activity) context;
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;

    }

    public static int getStatusBarHeight(Context context) {
        // getRealMetrics is only available with API 17 and +
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

}
