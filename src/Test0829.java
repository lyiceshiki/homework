
public class Test0829 {
    
    public static void main(String[] args){
        //String t = text("hellow world");
        String t = text("hellow world")
                       .concat(" ")
                       .concat("a")
                       .concat(" ")
                       .concat("have a good day")
                       .concat(" ")
                       .concat("java")
                       .concat(" ")
                       .concat("abcdefg")
                       .concat(" ")
                       .concat("hijklmn")
                       .replace("a","o")//置换
                       .substring(0, 40)//范围截取
                       .toUpperCase()//切换大写
                       .trim();
                       //.split(null).toString() 重新转换为String
                       //.toLowerCase();
                       //.format(null, args);
                       
        //System.out.println(text("hellow world"));
        //System.out.println(text(text("hellow world")));
        System.out.println(t);

        int x =10;
            if(x < 15){
                System.out.println("比15小");
            }
            }
            private static String text(String a){
                System.out.println("text length :" + a.length());
                return a;
            }
        }
        
        

