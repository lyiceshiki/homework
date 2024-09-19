package homework;

import java.util.regex.*;
public class homework0919 {
    public static void main(String...args) {
    //regexExample1();
    //regexMatch();
    regexMatch1();
    }

    private static void regexExample1() {
        String content = "I am noob" + "from youtube.com." ;
        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("contentの中にpatternがあるか " + isMatch);

    }

    private static void regexMatch() {
        String line = "i like Java ! Today is 0919 , really? ";
        //d は数字　＋は１より大きい　Dは数字以外の文字列　＊は０より大きい
        String pattern = "(\\w+)(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        int groupCount = m.groupCount();
        System.out.println("groupの数: " + groupCount);
        if (m.find( )) {
            //group(0)
            System.out.println("value1: " + m.group(0));
            System.out.println("value2: " + m.group(1));
            System.out.println("value3: " + m.group(2));
            System.out.println("value4: " + m.group(3));
            System.out.println("value5: " + m.group(4));
        } else {
            System.out.println("NO MATCH");
        }

    }

    private static void regexMatch1() {
        String regex = "\\bcat\\b";
        String input = "A cat can cat in a cat raw named catta";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        int count = 0 ;
        
        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }


        

    }



}
