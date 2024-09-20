package homework;

import java.util.regex.*;
public class homework0919 {
    public static void main(String...args) {
    //regexExample1();
    //regexMatch();
    //regexMatch1();
    //lookingAt();
    //replace();
    //appendReTa();
    checkTel("12134567890");
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

    private static void lookingAt(){
        String regex = "qwer";
        String input = "qwerrrrrrrr";
        String input1 = "qqqqwerrrrrrrr";
        Pattern pattern;
        Matcher matcher;
        Matcher matcher1;

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        matcher1 = pattern.matcher(input1);

        System.out.println("Current regex is : " + regex);
        System.out.println("Current input is : " + input);
        System.out.println("Current input1 is : " + input1);

        //lookingAtは部分一致
        System.out.println("lookingAt():" + matcher.lookingAt());
        //lookingAtは第一文字から比較する
        System.out.println("lookingAt():" + matcher1.lookingAt());
        //matchは全部一致
        System.out.println("matches(): "+matcher.matches());
        //
        System.out.println("matches(): "+matcher1.matches());
    }

    private static void replace() {
        String regex = "dog";
        String input = "The dog says meow. " + "All dogs say meow.";
        String replace = "cat";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        input = m.replaceAll(replace);
        System.out.println(input);

    }

    private static void appendReTa() {
        String regex = "a*b";
        String input = "aaabqooabbdatebjkl";
        String replace = "-";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, replace);

        }
        m.appendTail(sb);
        System.out.println(sb.toString());

    }

    private static void checkTel(String tel){
        String regex = "[0-9]{9,11}";
        System.out.println(tel.matches(regex)?"legal tel":"illegal tel");
    }

}
