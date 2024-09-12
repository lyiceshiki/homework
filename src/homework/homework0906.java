package homework;

public class homework0906 {
    public static  void main(String arg[]){
        
        /*//split  . 、 $、 | 和 * 等转义字符，必须得加 \\
        String str = new String("Welcome-to-Java");
        //System.out.println(str.split("-"));
        System.out.print("Result:\n" );
        for (String jieguo : str.split("-")){
            System.out.println(jieguo);
        }
        System.out.println("\n");
        System.out.print("Result2:\n");
        for (String jieguo : str.split("-",2)){
            System.out.println(jieguo);
        }

        System.out.print("\n");
        String str2 = new String("www.youtube.com");
        System.out.println("Result3:\n");
        for (String jieguo : str2.split("\\.",3)) {
            System.out.println(jieguo);
        }

        System.out.println("\n");
        String str3 = new String("100枚$200円");
        System.out.print("値段は：\n");
        for (String jieguo : str3.split("\\$")){
            System.out.println(jieguo);
        }

        System.out.println("\n");
        String str4 = new String("I like google and Youtube or Java");
        System.out.print("好み：\n");
        for (String jieguo : str4.split("and|or")){
            System.out.println(jieguo);
        }

        System.out.println("\n");
        String str5 = new String("A,B,C,D,E,F,G");
        String[] buff = str5.split(",");
        for(int i = 0 ;i < buff.length;i++){
            System.out.println(buff[i]);
        }
*/

/* //startswith subSequence toCharArray toLowerCase toUpperCase 
        String str = new String("www.youtube.com");
        System.out.println("Result:" + str.startsWith("www"));
        System.out.println("Result1:" + str.startsWith("youtube"));
        System.out.println("Result2:" + str.startsWith("youtube",4));
        System.out.println("Result3:" + str.subSequence(4,11));
        System.out.println("Result4:" + str.substring(4));
        System.out.println("Result5:" + str.substring(4,11));
        //System.out.println("Result6:" + str.toCharArray());
        System.out.println(str.toCharArray());
        String str1 = new String("WWW.YOUTUBE.COM");
        System.out.println("Result7:" + str1.toLowerCase());
        System.out.println("Result8:" + str.toUpperCase());
        System.out.println("Result9:" + str.toString());
        System.out.println(str.contains("y"));
        System.out.println(str.contains("z"));
        System.out.println(str.contains("youtu"));
*/        

/* //trim empty valueOf 
        String str = new String("     Java     ");
        System.out.println(str.trim());
        String str1 = "java";
        String str2 = "";
        String str3 = "        ";
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.length());
        System.out.println(str3.isEmpty());
        double d = 120.00;
        char c = 'a';
        char[] c1 = {'a','b','c','d'};
        float f = 2345.6f;
        long l = 12345000;
        boolean b = true;
        System.out.print("Result : " + String.valueOf(d) + "\n");
        System.out.print("Result : " + String.valueOf(c) + "\n");
        System.out.print("Result : " + String.valueOf(c1) + "\n");
        System.out.print("Result : " + String.valueOf(f)+ "\n");
        System.out.print("Result : " + String.valueOf(l)+ "\n");
        System.out.print("Result : " + String.valueOf(b)+ "\n");
*/

/* 
        StringBuilder sb = new StringBuilder(10);
        sb.append("youtube--");//0 y 1 o 2 u 3 t 4 u 5 b 6 e 7 - 8 - 9 
        System.out.println(sb);
        sb.append("?");//0 y 1 o 2 u 3 t 4 u 5 b 6 e 7 - 8 - 9 ? 10
        System.out.println(sb);
        sb.insert(10,"java");//0 y 1 o 2 u 3 t 4 u 5 b 6 e 7 - 8 - 9 ? 10 j 11 a 12 v 13 a
        System.out.println(sb);
        sb.delete(7,10);
        System.out.print(sb);
        StringBuffer sBuffer = new StringBuffer("\n视频网址：");
        sBuffer.append("www.");
        sBuffer.append("youtube");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        sBuffer.replace(10,18,"runoob.");
        System.out.println(sBuffer);
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.length());

*/

/* //26位アルファベット
        char arr[] = new char[26];
        for(int i = 0;i < 26;i++){
            arr[i] = (char)(i + 65);
        }
        for(int j = 0;j < 26;j++){
            System.out.println(arr[j]);
        }
*/

/* 
        char arr[] = new char[26];
        for(int i = 0;i < 26;i++){
            arr[i] = (char)(i + 65);
        }
        for(int j = 0;j < 26;j++){
            System.out.print(arr[j]);
            //System.out.println(arr[j]);//printlnは自動的に行折り返します。
            if((j + 1) % 7 == 0){
                //System.out.println("\n");
                System.out.println();
            }
            
            //if((j + 1) % 7 == 0){
                //System.out.println(arr[j]);//G,N,Uしかみえない
            //} 
        }
*/

/* 
        char arr[] = new char[26];
        for(int i = 0;i < 26;i++){
            arr[i] = (char)(i + 65);
        }
        for(int j = 0;j < 26;j++){
            System.out.print(arr[j]);
            if((j + 1 )% 7 == 0){
                System.out.println();
            }

            if(j == 16 || j == 22){
                System.out.print(" ");//結果はOPQ RSTU　VW XYZ
            }
        } 

        System.out.println();
        char arr1[] = new char[26];
        for(int i = 0; i < 26 ; i++){
            arr1[i] = (char)(i + 65);
        }

        for(int j = 0; j < 26;j++){
            System.out.print(arr1[j]);
            if(j == 16 ||j ==22){
                System.out.print(" ");
            }

            if (j ==6 || j ==13 || j == 19) {
                System.out.println();
            }
        }
*/        
/* 
        int size = 10;
        double[] aList = new double[size];
        aList[0] = 1.2;
        aList[1] = 2.6;
        aList[2] = 4.7;
        aList[3] = 6.9;
        aList[4] = 12.5;
        aList[5] = 23.3;
        aList[6] = 56.6;
        aList[7] = 100;
        aList[8] = 233.33;
        aList[9] = 314.15;
        
        double total = 0;
        for (int i = 0 ; i < size ; i++){
            total +=aList[i];
        }
        System.out.println(total);
        for (int i = 0 ; i < size ; i++){
            System.out.println(aList[i] + " ");
        }
        double max = aList[0];
        for(int i = 0 ; i < aList.length; i++){
            if(aList[i] > max){
                max = aList[i];
            } 
        }
        System.out.println("最大値は" + max);
*/

/* */
        double[] aList = {11.0 , 12.9 , 14.7 , 19};
        
        for (double element: aList) {
            System.out.println(element);
        }


    }

}
