import java.lang.*;
import java.util.Date;
import java.util.List;


public class Test {
    static boolean bool;
    public static void main(String[] args){
        //int a = 1;
        /*byte
          short
          int
          long
          float
          double
        */
        //char
        //String

        //boolean
        /*System.out.println(a);
        byte b1 = 49;
        System.out.println(b1);
        short s1 = -30000;
        System.out.println(s1);
        boolean b2 = true;
        System.out.println(b2);
        float f1 = 125.5f;
        System.out.println(f1);
        double d1 = 8D;
        System.out.println(d1);
        double d2 = 9.;
        System.out.println("d2=" + d2);
        double d3 = 99.99999;
        System.out.println("d3=" + d3);
        System.out.println("bool=" + bool);
        int t1 = 128;
        byte b5 = (byte)t1;
        System.out.println("b5=" + b5);
        int t2 = 32790;
        short s2 = (short)t2;
        System.out.println(s2);
        */
        /*
        int c
        System.out.println(c);
        もしｃを使うまえにローカル変数初期化しなくて、エラーが出る。
        */

        /*int a = 5;
        int b = 20;
        int c = 43;
        int d = 20;
        int e = 43;
        //System.out.println("a+b" + "=" + a + b);//答えはa+b=520
        //System.out.println("a+b" + "=" + (a + b));
        //System.out.println("a+b=" + (a + b));
        //System.out.println("a-b="  + (b - a));
        //System.out.println("a-b="  + (a - b));//負数が出る　答えはa-b=-15
        //System.out.println("a*b="  + (b * a));
        //System.out.println("a/b=" + (a / b));//答えはa/b=0
        //System.out.println("b/a=" + (b / a));
        //System.out.println("c/a=" + (c / a));//答えはc/a=8
        System.out.println("a++ = " + a++);//答えはa++ = 5
        System.out.println("++a = " + ++a);//++a = 7
        System.out.println("a-- = " + a-- );//a-- = 7
        System.out.println("--a = " + --a);//--a = 5
        System.out.println("++c + b++=" + ++c + b++);//4420
        System.out.println("++d + e++=" + (++d + e++));//64
        */
        /* 
        int a = 10, b = 20 ,c = 10;
        boolean a1 = true ,b2 = false,c3 = true;
        System.out.println("a==b =" + (a==b));
        System.out.println("a1==b2 =" + (a1==b2));
        System.out.println("a1==c3 =" + (a1==c3));
        System.out.println("a!=b =" + (a!=b));
        System.out.println("a>b =" + (a>b));
        System.out.println("a<b =" + (a<b));
        //System.out.println("a1>b2 =" + (a1>b2));
        System.out.println("a>=c =" + (a>=c));
        System.out.println("a<=b =" + (a<=b));
      */

      /*   
      int e1 = 60, e2 = 43 , e3 = 0;//e1=60= 0011 1100  e2= 0010 1011//
        e3 = e1 & e2;//0010 1000=40
        System.out.println("e1 & e2=" + e3);
        e3 = e1 | e2;//0011 1111=63
        System.out.println("e1 | e2=" + e3);
        e3 = e1 ^ e2;//0001 0111=23
        System.out.println("e1 ^ e2=" + e3);
        e3 = ~ e1;//1100 0011=195
        System.out.println("~e1 =" + e3);
        e3 = e1 << 2 ;//1111 0000=240
        System.out.println("e1 << 2=" + e3);
        e3 = e1 >> 3 ;//0111=7
        System.out.println("e1 >> 3=" + e3);
        e3 = e1 >> 1 ;//01 1110=30
        System.out.println("e1 >> 3=" + e3);
        e3 = e1 >>> 3;//0000 0111=7
        System.out.println("e1 >>> 3=" + e3);
        */

        /* 
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        */

        /* 
        int a = 5;
        boolean b = (a<4)&&(a++<10);
        System.out.println("result b ="+b);
        System.out.println("result a ="+a);
        */

        /*
        int a = 10 , b = 15, c = 0;
        c += a;
        System.out.println("c += a =" + c);
        c -= a;
        System.out.println("c -= a =" + c);
        c *= a;
        System.out.println("c += a =" + c);
        b /= a;
        System.out.println("b /= a =" + b);
        c =15;//0000 1111
        c <<= 2;//0011 1100
        System.out.println("c <<= 2 =" + c);
        c >>= 3;//0000 0111
        System.out.println("c >>= 3 =" + c);
        c &= a;//a=10=0000 1010 c=0000 0111 答えは0000 0010=2
        System.out.println("c &= a =" + c);
        c ^= a;//a=10=0000 1010 c=0000 0010 答えは0000 1000=8
        System.out.println("c ^= a =" + c);
        c |= a;//a=10=0000 1010 c=0000 1000 答えは0000 1010=10
        System.out.println("c |= a =" + c);
        */

        /* 
        int a = 3,b;
        b = (a == 1) ? 5 : 7;
        System.out.println("value of b =" + b);

        int c = 10, d = (c == 10) ? 20 : 25;
        System.out.println("value of d =" + d);

        int e = (a == 2) ? 5 :(b == 7) ? c : d;//まずは後ろの(b == 7) ? c : dを計算します。ｂ＝７ので(b == 7) ? c : dの結果は１０です。そして、(a == 2) ? 5 :１０を計算します。
        System.out.println(e);
        */
         /* 
        int x = 1;
         while (x < 5) {
          System.out.println("value of x =" + x);
          x++;
         }
        */
         /* 
         int x = 10;
         do{
          System.out.println("value of x =" + x);
          x++;
         }while(x < 15 );

         int y = 11;
         do{
          System.out.println("value of y =" + y);
          y++;
         }while(y < 10);

         for(int x1 = 10;x1 < 13;x1++){
          System.out.println(x1);
         }
*/
/* 
         int [] numbers = {10, 20, 30, 40 ,50};
        
         for(int x4 : numbers){
          //System.out.println( x4 );
          //System.out.println(",");
          if ( x4 == 30) {
          break;
         }
         System.out.println(x4);
         }
         System.out.println("\n");
*/
        
         int [] numbers1 = {10, 11, 12, 13, 14, 15};
         for(int x5 : numbers1){
          if (x5 == 14) {
            continue;
          }
          System.out.println(x5);
         }


      






    }
    private String format;
    public String getFormat(){
      return this.format;
    }
    public void setFormat(String format){
      this.format = format;
    }


}
 /* 
class Vehicle{}

 public class Car extends Vehicle{
    public static void main(String args[]){
      Car c1 = new Car();

      Vehicle v2 = new Car();
      Vehicle v3 = new Vehicle();

      boolean result1 =  c1 instanceof Vehicle;
      boolean result2 =  v2 instanceof Car;     
      boolean result3 =  v2 instanceof Vehicle;    
      boolean result4 =  v3 instanceof Car;

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
    }

    */