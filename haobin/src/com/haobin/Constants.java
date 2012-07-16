package com.haobin;

import android.view.Display;
import android.view.WindowManager;

public class Constants {

    private static Integer screenWidth;
    private static Integer screenHeight;

    public static void setDisplay(WindowManager windowManager) {
        Display display = windowManager.getDefaultDisplay();
        screenWidth = display.getWidth();
        screenHeight = display.getHeight();
    }

    public static Integer getIconImageWidth() {
        return screenWidth / 5;
    }

    public static Integer getIconImageHeight() {
        return screenWidth / 5;
    }

    public static Integer getIconWidth() {
        return screenWidth / 4;
    }

    public static Integer getIconHeight() {
        return screenWidth / 3;
    }

    public static Integer getScreenWidth() {
        return screenWidth;
    }

    public static void setScreenWidth(Integer screenWidth) {
        Constants.screenWidth = screenWidth;
    }

    public static Integer getScreenHeight() {
        return screenHeight;
    }

    public static void setScreenHeight(Integer screenHeight) {
        Constants.screenHeight = screenHeight;
    }

    public static Integer getTitleSize() {
        return (screenHeight / 1280) * 42;
    }

    public static Integer getContextSize() {
        return (screenHeight / 1280) * 33;
    }
}
