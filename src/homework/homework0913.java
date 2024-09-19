package homework;

import java.time.*;
import java.util.*;
import java.text.*;

public class homework0913 {
    public static void main(String[] args){
        /* 
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println("当前时间为：" + ft.format(date));
        */
        //dateNow();
        //dateLocal();
        //dateChange();
        //dateSearch();
        //dateTrans();
        //dateParse();
        //dateCalender();
        dateGreCal();
        monthCal();
}


    private static void dateNow(){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println("当前时间为：" + ft.format(date));
    }

    private static void dateLocal(){
        Date date = new Date();
        //printf格式化日期
        System.out.printf("%tY-%tm-%td %tb %tA %tZ %tl:%tM:%tS %tp", date, date , date, date, date, date, date, date, date, date);
    }

    private static void dateChange(){
        Date date = new Date();
        System.out.printf("全部日期和时间信息: %tc%n",date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式(12时制):%tr%n",date);
        System.out.printf("HH:MM:SS格式(24时制):%tT%n",date);
        System.out.printf("HH:MM格式(24时制):%tR",date);

    }

    private static void dateSearch(){
        Date date = new Date();
        //search対象は％と＄の間でなければならない　ここは
        System.out.printf("%1$s %2$tB %2$td, %2$tY" ,
                          "Due date:", date);
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY",
                            "Due date:", date);
    }

    private static void dateTrans(){
        Date date = new Date();
        //ｂは月の略語
        String str = String.format(Locale.US,"英語の月の略語: %tb",date);
        System.out.println(str);
        System.out.printf("月の略語: %tb%n",date);
        //
        str = String.format(Locale.US,"英語の月の正語:%tB",date);
        System.out.println(str);
        System.out.printf("月の正語:%tB", date);
        //
        str = String.format(Locale.US,"英語の曜日の略語:%ta",date);
        System.out.println(str);
        System.out.printf("曜日の略語:%ta",date);
        //
        str = String.format(Locale.US,"英語の曜日の正語:%tA",date);
        System.out.println(str);
        System.out.printf("曜日の正語:%tA",date);
        //
        System.out.printf("西暦の上２桁(足りない桁の前に０をつける):%tC%n",date);  
        //  
        System.out.printf("西暦の下２桁(足りない桁の前に０をつける):%ty%n",date);  
        //  
        System.out.printf("今日は今年の何日分:%tj%n",date);  
        //  
        System.out.printf("月の２桁(足りない桁の前に０をつける):%tm%n",date);  
        //  
        System.out.printf("日の２桁(足りない桁の前に０をつける):%td%n",date);  
        //  
        System.out.printf("月の日の２桁(足りない桁の前に０をつけない):%te",date); 

    }

    private static void dateParse(){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = "2019-03-20";

        System.out.print(input + "Parses as");

        Date t;

        try {
            t = ft.parse(input);
            System.out.print(t);

        }catch (ParseException e) {
            System.out.println("Unparseable using" + ft);
        }
    }

    private static void dateSleep(){
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    private static void dateCheck(){
        try{
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is :" + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    private static void dateCalender(){
        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH) + 1;
        int date = c1.get(Calendar.DATE);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int day = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println(c1);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(day);
    }

    private static void dateGreCal(){
    String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    int year;

    GregorianCalendar gCalendar = new GregorianCalendar();
    System.out.print("Date: ");
    System.out.print(months[gCalendar.get(Calendar.MONTH)]);
    System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
    System.out.println(year = gCalendar.get(Calendar.YEAR));
    System.out.print("Time: ");
    System.out.print(gCalendar.get(Calendar.HOUR) + ":");
    System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
    System.out.println(gCalendar.get(Calendar.SECOND));


    if (gCalendar.isLeapYear(year)) {
        System.out.println("当前年份是闰年");
    } else {
        System.out.println("当前年份不是闰年");
    }
    }

    private static void monthCal() {
        Calendar c1 = Calendar.getInstance();
        //月份是从0开始
        c1.set(2024, 1, 1);

        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
        //年份和日期是从1开始
        c1.set(2024, 1, 0);
        //当日期为0的时候，月份会变成上个月，显示为0，日期变为31
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
    
        c1.set(2024, 2, 1);

        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
        
        c1.set(2024, 2, 0);
        //上个月最后一天是29号
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
    
        c1.set(2024, 2, -10);
        //日期为负数时 29-10=19
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
        
        c1.set(2024, -2, 1);
        //月份为负数的时候 12-2=10 
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
    
        c1.set(-2024, 2, 1);
        //年份为负数时，会变成绝对值+1
        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
    }
}
