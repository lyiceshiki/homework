package homework;
//import java.lang.Math;

import java.io.UnsupportedEncodingException;

import javafx.scene.text.Text;

public class homework0830 {
    public static void main(String[] args){
/* //switch case break
        int fenshu = 80;
        System.out.println("your score = " + fenshu);
        switch (fenshu) {
            case 90:
                System.out.println("great");
                break;
            case 80:
                System.out.println("good");
                break;
            case 70:
                System.out.println("fine");        
        
            default:
                System.out.println("not data");
                break;
        }

        //breakがない場合、Javaは合うcaseに来た後も実行し続ける。
        int fenshu1 = 80;
        System.out.println("your score = " + fenshu1);
        switch (fenshu1) {
            case 90:
                System.out.println("great");
            case 80:
                System.out.println("good");
            case 70:
                System.out.println("fine");        
            default:
                System.out.println("not data");
        }    
*/

/* //math number
        System.out.println(Math.PI);
        System.out.println(Math.sin(Math.PI/3));
        System.out.println(Math.cos(Math.PI/4));
        System.out.println(Math.tan(Math.PI/6));
        System.out.println(Math.atan(1));
        System.out.println(Math.min(10, 0));
        System.out.println(Math.max(233.2, 2777));
        System.out.println(Math.abs(-100));//絶対値
        System.out.println(Math.sqrt(1.6));//平方根
        System.out.println(Math.pow(4, 3));
        System.out.println(Math.toDegrees(Math.PI/2));
        System.out.println(Math.toRadians(Math.PI/3));
        System.out.println(Math.random());
        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(1.5));
        System.out.println(Math.ceil(1.6));
        System.out.println(Math.ceil(-1.6));
        System.out.println(Math.floor(2.6));
        System.out.println(Math.floor(-2.2));
        System.out.println(Math.exp(2));
        System.out.println(Math.log(0));
        

        Integer a1 = 100;
        Integer b1 = 100;
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));

        Integer a2 = 1000;
        Integer b2 = 1000;
        System.out.println(a2 == b2);
        System.out.println(a2.equals(b2));

        Integer a3 = new Integer(100);
        Integer b3 = new Integer(100);
        System.out.println(a3 == b3);
        System.out.println(a3.equals(b3));
*/

/* //Java的转义序列
        char ch = 'a';
        char[] charArray = {'a','b','c','d'} ;
        System.out.println("char\t練習\b中" + ch);
        System.out.println("char\n練習中\r" + charArray[2]);
        System.out.println("Java\f\'練\'\"習\"中\\");
*/
/*  //char类
        String s1 = "Today is Monday";
        String s2 = " ";
        System.out.println(Character.isLetter('J'));
        System.out.println(Character.isLetter('4'));
        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isUpperCase('v'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('e'));
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.toString('1'));
        System.out.println(s1.charAt(10));//範囲は 0 から length() - 1　まで
        for(int i = 0; i < s1.length(); i++){
            //Character.isUpperCase(s1.charAt(i));
            if(Character.isUpperCase(s1.charAt(i))){
                s2 += s1.charAt(i) + " ";
                
            }
            //System.out.println(s1.charAt(i));
            //System.out.println(s2);
        }
        
        //System.out.println(s1.charAt(i));
        System.out.println(s2);
*/

/*  
        String s3 = "I learn Java everyday.";
        String s4 = "I love Java.";
        int l1 = s3.length();
        System.out.println(l1);
        System.out.println(s3.concat(s4));
        System.out.println(s3.charAt(5));
        System.out.println(s4.compareTo("I love Jova"));
        System.out.println(s4.compareTo("I love Java."));
        System.out.println(s3.compareTo(s4));
        
        String s5 = "JAVA";
        String s6 = "java";
        String s7 = "JAVAABC";
        System.out.println(s5.compareToIgnoreCase(s6));
        System.out.println(s6.compareToIgnoreCase(s7));
        System.out.println(s7.compareToIgnoreCase(s5));
        
        boolean r1 = s5.contentEquals(s6);
        System.out.println(r1);
        System.out.println(s5.contentEquals(s7));
        StringBuffer s8 = new StringBuffer("JAVA");
        System.out.println(s5.contentEquals(s8));
        
        char[] s9 = {'I',' ','L','o','v','e','!','J','a','v','a'};
        String s10 = "";
        s10 = s10.copyValueOf( s9 );
        System.out.println(s10);
        System.out.println(s10.copyValueOf(s9,2,5));
        
        boolean r2;
        r2 = s5.endsWith("a");
        System.out.println(r2);
        r2 = s5.endsWith("A");
        System.out.println(r2);

        String t1 = "Hello World";
        System.out.println(t1.equals("Hello World"));
        String t2 = new String("Hello World");
        System.out.println(t2.equals(t1));//equalsはキャラクターコードを比較する
        System.out.println(t2 == t1);//＝＝はアドレスを比較する
        System.out.println(t1.equalsIgnoreCase("hellow world"));
        try{
            byte[] t3 = t1.getBytes();
            System.out.println("答えは" + t3);
            //t3 = t1.getBytes( "UTF-8" );
            t3 = t1.getBytes( "UTF-8" );
            System.out.println("答えは" + t3);
            t3 = t1.getBytes( "ISO-8859-1" );
            System.out.println("答えは" + t3);
           }catch ( UnsupportedEncodingException e){
            System.out.println("不支持的字符集");}

        String s11 = new String("www.youtube.com");
        char[] s12 = new char[7];
        s11.getChars(4,11,s12,0);
        System.out.print("输出的值为：");
        System.out.println(s12);
        System.out.println(s11.hashCode());
        System.out.println(s12.hashCode());
*/
/*     indexOf and lastIndexOf
        String s13 = "aaabcbccdd11221233abc";
        //indexOf
        System.out.println(s13.indexOf("e"));
        System.out.println(s13.indexOf("a",3));
        System.out.println(s13.indexOf("b"));
        System.out.println(s13.indexOf(98));
        System.out.println(s13.indexOf(97,3));
        System.out.println(s13.indexOf("a",3));
        
        String subs13 = new String("cdd");
        String subs14 = new String("123");
        String subs15 = new String("122");
        System.out.print("cdd初めて出る時：");
        System.out.println(s13.indexOf(subs13));
        System.out.print("123初めて出る時：");
        System.out.println(s13.indexOf(subs14));
        System.out.print("122初めて出る時：");
        System.out.println(s13.indexOf(subs15));
        
        //String s13 = "aaabcb233abc";
        String s13 = new String("aaabcb233abc");
        System.out.println("a最后出现的位置:" + s13.lastIndexOf("a"));
        System.out.println("从第7个位置开始查找a最后出现的位置:" + s13.lastIndexOf("a",7));
        System.out.println("从第7个位置开始查找a最后出现的位置:" + s13.lastIndexOf( 'a' , 7 ));
        System.out.print("从第7个位置开始查找a最后出现的位置:");
        System.out.println(s13.lastIndexOf('a',7));
        //String subs16 = "abc";
        String subs16 = new String("abc");
        System.out.println("subs16最后出现的位置:" + s13.lastIndexOf(subs16));
        System.out.println("从第4个位置开始查找subs16最后出现的位置:" + s13.lastIndexOf(subs16,4));
        System.out.println("从第14个位置开始查找subs16最后出现的位置:" + s13.lastIndexOf(subs16,14));
*/

/* 
        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = new String("ab");
        String str6 = new String("ab");
        String str7 = "a" + "b";
        System.out.println(str5.equals(str3));//同じ値 true
        System.out.println(str5 == str3);//違うアクセス
        System.out.println(str5.intern() == str3);//true
        System.out.println(str5.intern() == str4);//false
        System.out.println(str5.intern() == str6);
        System.out.println(str3.intern() == str4);
        System.out.println(str3.intern() == str7);
*/
/* 
        //matches regionMatches
        String str1 = new String("www.runoob.com");
        String str2 = new String("(.*)runoob(.*)");
        String str3 = new String("runoob");
        System.out.println(str1.matches("(.*)runoob(.*)"));
        System.out.println(str1.matches(str2));
        System.out.println(str1.matches(str3));
        System.out.println(str1.matches("(.*)youtube(.*)"));
        String str4 = new String("RUNOOB");
        System.out.println(str1.regionMatches(4,str2,0,10));
        System.out.println(str1.regionMatches(4,str3,0,6));
        System.out.println(str1.regionMatches(4,str4,0,6));
        System.out.println(str1.regionMatches(true,4,str4,0,6));
        System.out.println(str1.regionMatches(6,str3,0,6));
*/

        /*//replace
        String str1 = new String("Java20240905");
        System.out.println(str1.replace("J","j"));
        System.out.println(str1.replace("0","o"));
        String str2 = new String("www.runoob.com");
        System.out.println(str1.replaceAll("Java","Date"));
        System.out.println(str2.replaceAll("www","http:www"));
        System.out.println(str2.replaceAll("runoob","youtube"));
        System.out.println(str2.replaceAll("(.*)runoob(.*)","youtube"));
        System.out.println(str2.replaceAll("(.*)google(.*)","youtube"));
        
        String str1 = "Hello Java.I am learning Java.";
        System.out.println(str1.replaceFirst("Java","c++"));
        System.out.println(str1.replaceFirst("c++","google"));
        System.out.println(str1.replaceFirst("(.*)Java(.*)","google"));
        */

        /* *///split
        String str = new String("welcome-to-Java");
        //System.out.println(str.split("-"));
        
        




        





    }


}
