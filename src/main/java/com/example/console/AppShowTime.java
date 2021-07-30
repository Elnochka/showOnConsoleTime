package com.example.console;

import com.example.core.ShowTimeImpl;

import java.util.Locale;

public class AppShowTime {
    public static void main(String[] args) {
        ShowTimeImpl showTime = new ShowTimeImpl();
        String result = showTime.findTimeOfDay(Locale.getDefault());
        System.out.println(result);
    }
}
