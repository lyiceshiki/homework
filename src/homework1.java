public class homework1 {
    public static void main(String[] args)
    {
        /* 
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((10 - i) >= j) {
                    //System.out.println(i + " + " + j + " = " + (i + j));
                }
            }   
        }
        String s = "Hello,World";  
        String[] arr = s.split(",");  
        System.out.println(arr.length);

        String t1 = "Hello World";
        System.out.println(t1.equals("Hello World"));
        String t2 = new String("Hello World");
        System.out.println(t2.equals(t1));//equalsはキャラクターコードを比較する
        System.out.println(t2 == t1);//＝＝はアドレスを比較する

        int[] array = new int[0];
        System.out.println(array);

        int[] a = new int[]{2,3};
*/

        String[][] array1 = { { "A", "B" }, null, { "C", "D", "E"} };
        int total = 0;
        for(String[] tmp:array1) {
            //total += tmp.length;
            System.out.println(tmp);
            
        }
        //System.out.println(total);
        
    }
}

