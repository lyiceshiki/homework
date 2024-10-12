package homework;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class homework0912 {
    public static void main(String[] args) {
        
        
    }

    private static void print(String message, String text){
        System.out.print("【");
        // date();
        // time();
        dateTime();
        System.out.print("】 - ");
        System.out.print(message);
        System.out.print(" - ");
        System.out.println(text);
    }

    private static void date(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter date_1 = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter date_2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter date_0 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日");
        System.out.print(date.format(date_0));
    }

    private static void time(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter time_1 = DateTimeFormatter.ISO_TIME;
        System.out.print(time.format(time_1));
    }

    private static void dateTime(){
        ZonedDateTime dateTime = ZonedDateTime.now();
        ZonedDateTime nyTime = dateTime.withZoneSameInstant(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter date_1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter date_0 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.print(nyTime.format(date_0));
    }
        


    }


