package homework;

import java.util.regex.*;
public class homework0919 {
    public static void main(String...args) {
    regexExample1();
    }

    private static void regexExample1() {
        String content = "I am noob" + "from youtube.com." ;
        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("contentの中にpatternがあるか " + isMatch);

    }

    private static void regexMatch() {
        String line = "i like Java ! Today is 0919 , really? ";
        //
        String pattern = "(\\w+)(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        int groupCount = m.groupCount();
        System.out.println("groupの数: " + groupCount);
    }

}
