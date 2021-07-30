package com.example.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ShowTimeImpl implements ShowTime{
    private static final Logger LOGGER = LoggerFactory.getLogger(ShowTimeImpl.class);

    private Locale currentLocale = Locale.getDefault();
    private ResourceBundle resourceBundle;
    private int hours;

    public ShowTimeImpl(Locale currentLocale){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        this.hours = cal.get(Calendar.HOUR_OF_DAY);
        this.currentLocale = currentLocale;
        this.resourceBundle = ResourceBundle.getBundle("messages", currentLocale);

    }

    public ShowTimeImpl(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        this.hours = cal.get(Calendar.HOUR_OF_DAY);
        this.resourceBundle = ResourceBundle.getBundle("messages", currentLocale);

    }

    public ShowTimeImpl(int hours) {
        this.hours = hours;
        this.resourceBundle = ResourceBundle.getBundle("messages", currentLocale);
    }

    public ShowTimeImpl(Locale currentLocale, int hours) {
        this.currentLocale = currentLocale;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    @Override
    public String findTimeOfDay() {
        LOGGER.info("Find time of day.");
        String timeOfDay = "";

        switch (hours) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 23:

                timeOfDay = "night";
                break;

            case 6:
            case 7:
            case 8:

                timeOfDay = "morning";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:

                timeOfDay = "day";
                break;

            case 19:
            case 20:
            case 21:
            case 22:
                timeOfDay = "evening";
                break;
            default:
                LOGGER.warn("Something wrong!");
                break;

        }
        LOGGER.info("Create: Good " + timeOfDay + ", World!");
        return printLocale(timeOfDay);
    }

    @Override
    public String printLocale(String timeOfDay) {
        LOGGER.info("Print for current locale.");
        String result = "";
        if(currentLocale.getLanguage().equals("ru")) {
            try {
                result = new String(resourceBundle.getString(timeOfDay).getBytes(StandardCharsets.ISO_8859_1), "windows-1251");
            } catch (UnsupportedEncodingException ex) {
                LOGGER.warn("UnsupportedEncodingException");
                ex.getStackTrace();
            }
        }
        else{
            result = resourceBundle.getString(timeOfDay);
        }

        LOGGER.info(result);
        return result;

    }
}
