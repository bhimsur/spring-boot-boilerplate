package io.bhimsur.springbootboilerplate.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilFormat {
    public static final String DD_MM_YYYY_FORMAT = "dd-MM-yyyy";

    public String dateToString(Long input) {
        SimpleDateFormat format = new SimpleDateFormat(DD_MM_YYYY_FORMAT);
        return format.format(new Date(input));
    }

    public String dateToString(Date input) {
        SimpleDateFormat format = new SimpleDateFormat(DD_MM_YYYY_FORMAT);
        return format.format(input);
    }

    public Date stringToDate(String input) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(DD_MM_YYYY_FORMAT);
            return format.parse(input);
        } catch (ParseException ignored) {}
        return null;
    }

    public Long stringToEpoch(String input) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(DD_MM_YYYY_FORMAT);
            return format.parse(input).getTime();
        } catch (ParseException ignored) {}
        return null;
    }
}
