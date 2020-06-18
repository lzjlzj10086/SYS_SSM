package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * 时间转字符串
     * @param date
     * @param patt
     * @return
     */
    public static String dateToString(Date date,String patt){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);
        String dateString = simpleDateFormat.format(date);
        return dateString;
    }

    /**
     * 字符串传时间
     * @param dateString
     * @param patt
     * @return
     * @throws ParseException
     */
    public static Date StringToDate(String dateString,String patt) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);
        Date date = simpleDateFormat.parse(dateString);
        return date;
    }
}
