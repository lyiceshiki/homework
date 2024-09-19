package homework;

public class wushiyin {
    public static void main(String...args){
        /*
         *  0x3042, 0x3044, 0x3046, 0x3048, 0x304A,  // あ行
            0x304B, 0x304D, 0x304F, 0x3051, 0x3053,  // か行
            0x3055, 0x3057, 0x3059, 0x305B, 0x305D,  // さ行
            0x305F, 0x3061, 0x3064, 0x3066, 0x3068,  // た行
            0x306A, 0x306B, 0x306C, 0x306D, 0x306E,  // な行
            0x306F, 0x3072, 0x3075, 0x3078, 0x307B,  // は行
            0x307E, 0x307F, 0x3080, 0x3081, 0x3082,  // ま行
            0x3084, 0x3086, 0x3088,                  // や行
            0x3089, 0x308A, 0x308B, 0x308C, 0x308D,  // ら行
            0x308F, 0x3092, 0x3093                   // わ行 + ん
         */
        //hiragana1();
        hiragana2();


    }
    private static void hiragana1(){
        System.out.println("五十音图：");
        System.out.println("----------------");

        for (int i = 0,count = 0; i < 46; i++) {
            char hiragana = (char)(0x3042 + i); 
            
            if (hiragana == 'ぃ' || hiragana == 'ぅ' || hiragana == 'ぇ' || hiragana == 'ぉ' || hiragana == 'っ') {
                continue;
            }

            System.out.print(hiragana + " ");
            count++;

            if (count % 5 == 0) {  
                System.out.println(); 
            }
        }
    }

    private static void hiragana2(){
        System.out.println("五十音图：");
        System.out.println("----------------");

        int[] hiraganaCode = {
            0x3042, 0x3044, 0x3046, 0x3048, 0x304A,  
            0x304B, 0x304D, 0x304F, 0x3051, 0x3053,  
            0x3055, 0x3057, 0x3059, 0x305B, 0x305D, 
            0x305F, 0x3061, 0x3064, 0x3066, 0x3068,  
            0x306A, 0x306B, 0x306C, 0x306D, 0x306E,  
            0x306F, 0x3072, 0x3075, 0x3078, 0x307B,  
            0x307E, 0x307F, 0x3080, 0x3081, 0x3082,  
            0x3084, 0x3086, 0x3088,                  
            0x3089, 0x308A, 0x308B, 0x308C, 0x308D,  
            0x308F, 0x3092, 0x3093                   
        };

        for (int i = 0; i < hiraganaCode.length; i++) {
            char hiragana = (char) hiraganaCode[i];  
            System.out.print(hiragana + " ");

            
            if (i == 37 || i == 42) {
                System.out.println();
            } else if((i + 1) % 5 == 0 && i != 39 && i != 44) {
                System.out.println();
            }
            /* 
            if ((i + 1) % 5 == 0) {
                System.out.println();  
            }
            */
        }
    }



}
