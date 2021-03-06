package com.example.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class ShowTimeImplTest {
    Locale localeRu = new Locale("ru");

    @Test
    public void testFindTimeOfMorning(){
        //GIVEN
        ShowTimeImpl showTimeHours = new ShowTimeImpl(6);
        String resultExpected = "Доброе утро, Мир! в 6.00 - 9.00";
        //WHEN
        String resultActual = showTimeHours.findTimeOfDay(localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testFindTimeOfDay(){
        //GIVEN
        ShowTimeImpl showTimeHours = new ShowTimeImpl(9);
        String resultExpected = "Добрый день, Мир! в 9.00 - 19.00";
        //WHEN
        String resultActual = showTimeHours.findTimeOfDay(localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testFindTimeOfEvening(){
        //GIVEN
        ShowTimeImpl showTimeHours = new ShowTimeImpl(19);
        String resultExpected = "Добрый вечер, Мир! в 19.00 - 23.00";
        //WHEN
        String resultActual = showTimeHours.findTimeOfDay(localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testFindTimeOfNight(){
        //GIVEN
        ShowTimeImpl showTimeHours = new ShowTimeImpl(23);
        String resultExpected = "Доброй ночи, Мир! в 23.00 - 6.00";
        //WHEN
        String resultActual = showTimeHours.findTimeOfDay(localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleDay(){
        //GIVEN
        ShowTimeImpl showTime = new ShowTimeImpl();
        String resultExpected = "Добрый день, Мир! в 9.00 - 19.00";
        //WHEN
        String resultActual = showTime.printLocale("day", localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleMorning(){
        //GIVEN
        ShowTimeImpl showTime = new ShowTimeImpl();
        String resultExpected = "Доброе утро, Мир! в 6.00 - 9.00";
        //WHEN
        String resultActual = showTime.printLocale("morning", localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleEvening(){
        //GIVEN
        ShowTimeImpl showTime = new ShowTimeImpl();
        String resultExpected = "Добрый вечер, Мир! в 19.00 - 23.00";
        //WHEN
        String resultActual = showTime.printLocale("evening", localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleNight(){
        //GIVEN
        ShowTimeImpl showTime = new ShowTimeImpl();
        String resultExpected = "Доброй ночи, Мир! в 23.00 - 6.00";
        //WHEN
        String resultActual = showTime.printLocale("night", localeRu);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleDayEn(){
        //GIVEN
        ShowTimeImpl showTimeLocale = new ShowTimeImpl();
        String resultExpected = "Good day, World! in 9.00 - 19.00";
        //WHEN
        String resultActual = showTimeLocale.printLocale("day", Locale.ENGLISH);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleMorningEn(){
        //GIVEN
        ShowTimeImpl showTimeLocale = new ShowTimeImpl();
        String resultExpected = "Good morning, World! in 6.00 - 9.00";
        //WHEN
        String resultActual = showTimeLocale.printLocale("morning", Locale.ENGLISH);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleEveningEn(){
        //GIVEN
        ShowTimeImpl showTimeLocale = new ShowTimeImpl();
        String resultExpected = "Good evening, World! in 19.00 - 23.00";
        //WHEN
        String resultActual = showTimeLocale.printLocale("evening", Locale.ENGLISH);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }

    @Test
    public void testPrintLocaleNightEn(){
        //GIVEN
        ShowTimeImpl showTimeLocale = new ShowTimeImpl();
        String resultExpected = "Good night, World! in 23.00 - 6.00";
        //WHEN
        String resultActual = showTimeLocale.printLocale("night", Locale.ENGLISH);
        //THEN
        Assert.assertEquals(resultExpected, resultActual);

    }
}
