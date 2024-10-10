package com.example.demo.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public String getFirstOfNextMonth() {
        // get a reference to today
        LocalDate today = LocalDate.now();
        // having today,
        LocalDate firstOfNextMonth = today
                // add one to the month
                .withMonth(today.getMonthValue() + 1)
                // and take the first day of that month
                .withDayOfMonth(1);
        // then return it as formatted String
        return firstOfNextMonth.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private Date getNextDate(Date nowDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(nowDate);
        c.add(Calendar.MONTH, 1);
        c.set(Calendar.DATE, c.getMaximum(Calendar.DATE));
        Date nextDate = c.getTime();
        System.out.println(nextDate);
        return nextDate;
    }

    public LocalDate nthDayOfFollowingMonth(Date currentDate, int desiredDayOfMonth, int plusMonth) {
        LocalDate localDate = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return YearMonth.from(localDate).plusMonths(plusMonth).atDay(desiredDayOfMonth);
    }

    public static String toString(LocalDate localDate, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDate.format(formatter);
    }

    //main method
    public static void main(String[] args) throws ParseException {
        DateTime obj = new DateTime();
        obj.getNextDate(new Date());


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //dates to be compare
        Date date1 = new Date();

        Date date2 = sdf.parse("08-05-2024");

        Date dateTest = date2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateTest);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("current day " + currentDayOfMonth);
        LocalDate localDate = obj.nthDayOfFollowingMonth(dateTest, 9, 0);
        if (currentDayOfMonth > 9) {
            localDate = obj.nthDayOfFollowingMonth(new Date(), 9, 1);
        }
        System.out.println("nthDayOfFollowingMonth: " + localDate);
        System.out.println("toStr: " + obj.toString(localDate, "dd/MM/yyyy"));
    }
}
