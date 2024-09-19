package classroom;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class zimubiao {
    public static void main(String[] args) {
        //char[] letters = new char[26];
        //String[] letters = new String[4];
        String[] letters = {"","","",""};
        int j = 0 ;
        for(int i = 0 ; i < 26 ; i++){
            letters[j] += (char)(i + 65);
            if (i == 6 || i ==13 || i ==19) {
                j++;
            }
            if (i == 16 || i ==22) {
                letters[j] = " ";
            }
            
        }
        
        
    }

    private static void print(String message, String...text){
        String header = "【" + dateTime() + "】 - " + message + " - " ;
        String spaces = "";
        for(int i = 0; i < header.length();i++) {
            spaces += " ";
        }
        System.out.println(header);
        System.out.print("【");
        // date();
        // time();
        dateTime();
        System.out.print("】 - ");
        System.out.print(message);
        System.out.print(" - ");
        System.out.println(text);
    }

    private static void dateTime(){
        ZonedDateTime dateTime = ZonedDateTime.now();
        ZonedDateTime nyTime = dateTime.withZoneSameInstant(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter date_1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter date_0 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.print(nyTime.format(date_0));
    }

}
