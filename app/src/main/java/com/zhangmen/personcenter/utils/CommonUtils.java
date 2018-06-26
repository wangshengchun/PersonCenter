package com.zhangmen.personcenter.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class CommonUtils {


    @SuppressWarnings("deprecation")
    public static int getHeight(Context context, int weight, int width_pic,
                                int height_pic) {
        return ((((Activity) context).getWindowManager().getDefaultDisplay()
                .getWidth() / weight) * height_pic) / width_pic;
    }

    public static int getHeight(int width, int width_pic, int height_pic) {
        return (width * height_pic) / width_pic;
    }


    /**
     * 得到屏幕的高度
     *
     * @param context 上下文
     * @return 屏幕的高度
     */
    @SuppressWarnings("deprecation")
    public static int getScreenHeight(Context context) {
        return ((Activity) context).getWindowManager().getDefaultDisplay()
                .getHeight();
    }

    /**
     * 得到屏幕的宽度
     *
     * @param context 上下文
     * @return 屏幕的宽度
     */
    @SuppressWarnings("deprecation")
    public static int getScreenWidth(Context context) {
        return ((Activity) context).getWindowManager().getDefaultDisplay()
                .getWidth();
    }


    public static void setWidAndHei(Context context,View v,int imageWidthp, int screenWidthp) {
        ViewGroup.LayoutParams lp = v.getLayoutParams();
        int screenWidth = getScreenWidth(context);
        int imgWidth = imageWidthp * screenWidth / screenWidthp;
        lp.width = imgWidth;
    }

}
