package com.example.core;

import java.util.Locale;

public interface ShowTime {
    String findTimeOfDay(Locale locale);
    String printLocale(String timeOfDay, Locale currentLocale);
}
