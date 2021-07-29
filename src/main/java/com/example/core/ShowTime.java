package com.example.core;

import java.util.Locale;

public interface ShowTime {
    String findTimeOfDay();
    String printLocal(String timeOfDay, Locale currentLocal);
}
