package homework;

import java.util.Random;
import java.util.Scanner;

public class highernumberwin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("请输入一个0-9之间的数字: ");
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 9) {
            System.out.println("输入无效，请输入0-9之间的数字。");
            return;
        }

        int randomNumber = random.nextInt(10);
        System.out.println("生成的随机数字是: " + randomNumber);

        if (userInput > randomNumber) {
            System.out.println("You Win!");
        } else if (userInput < randomNumber) {
            System.out.println("You Lose!");
        } else {
            System.out.println("Draw!");
        }

        scanner.close();
    }
}
