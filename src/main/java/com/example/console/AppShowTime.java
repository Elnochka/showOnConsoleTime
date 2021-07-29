package com.example.console;

import com.example.core.ShowTimeImpl;

public class AppShowTime {
    public static void main(String[] args) {
        ShowTimeImpl showTime = new ShowTimeImpl();
        String result = showTime.findTimeOfDay();
    }
}
