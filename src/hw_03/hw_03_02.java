package hw_03;

import java.util.Random;
import java.util.Scanner;

public class hw_03_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(10);  // 產生一個0到9的隨機數字
        int guess = -1;  // 初始猜測值為-1

        System.out.println("開始猜數字吧！");

        while (guess != numberToGuess) {
            System.out.print("請輸入你的猜測：");
            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("猜錯囉，太小了！");
            } else if (guess > numberToGuess) {
                System.out.println("猜錯囉，太大了！");
            } else {
                System.out.println("答對了！答案就是" + numberToGuess);
            }
        }

    }

}
