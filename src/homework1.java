public class homework1 {
    public static void main(String[] args)
    {
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
    }
}

