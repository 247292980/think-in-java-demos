package com.lgp.thinkinjavademos.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/15 17:01
 * @DESCRIPTION
 **/
public class LocalDateTimeTest {
    public static void main(String[] args) {

        //创建LocalDateTime对象
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1= LocalDateTime.of(2018, 11, 11, 11, 11);
        System.out.println(localDateTime1);

        //获取LocalDateTime对象的属性
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());

        //根据已有的LocalDateTime对象创建新的对象，原来的对象保持不变
        LocalDateTime localDateTime2=localDateTime.withDayOfMonth(1);
        LocalDateTime localDateTime3=localDateTime.withDayOfYear(1);
        LocalDateTime localDateTime4=localDateTime.withHour(1);
        LocalDateTime localDateTime5=localDateTime.withMinute(1);
        LocalDateTime localDateTime10=localDateTime.withMonth(1);
        LocalDateTime localDateTime6=localDateTime.withYear(2019);
        LocalDateTime localDateTime7=localDateTime.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime localDateTime8=localDateTime.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDateTime localDateTime9=localDateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
        System.out.println(localDateTime5);
        System.out.println(localDateTime6);
        System.out.println(localDateTime7);
        System.out.println(localDateTime8);
        System.out.println(localDateTime9);
        System.out.println(localDateTime10);

        LocalDate localDate=localDateTime.toLocalDate();
        LocalTime localTime=localDateTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

    }
}
