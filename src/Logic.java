public class Logic {

    public static void main(String[] args) {
        /* 
        int a = 123;
        String text = "abc";
        Object o = null;
        if(a >=90){
            System.out.println("A");
        } else if(a >= 80){
            System.out.println("B");
        }
        else if(a >= 70){
            System.out.println("C");
        }
        else{
            System.out.println("false");
        }

        switch (a) {
            case 90:
                System.out.println("A");
                break;
        
            default:
                System.out.println("c");
                break;
        }
*/
        int[] arr = new int[]{1,2,3};
        int[] arr2 = new int[3];
        int arr3[] = {1,2,3};
        int[][] arrs = {{}};
        int[][] arrs1 = new int[3][3];
        int[][] as[][][] = null;//5维数组

        for(int i = 0 ; i < 3; i++){
            System.out.println(i);
        }
        for(int i = 0;i < arr.length;i++){
            arr[i] = i;
        }
        for(int i : arr2){
            System.out.println(i);
        }

        int j = 0;
        while (j < 9) {
            System.out.println(j);
            //j++;
            if(j < 3){
                j++;
                continue;
            }else if(j >5){
                break;
            } else {
                j++;
            }
            //j++;
        }

        if(false)
        System.out.println("123");//没花括号只执行这一行

        
    }

}
