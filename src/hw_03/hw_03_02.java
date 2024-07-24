package hw_03;

import java.util.Random;
import java.util.Scanner;

public class hw_03_02 {
    public static void main(String[] args){
        /**
         * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
         * 對則顯示正確訊息,如圖示結果:
         */
        /**
         * (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
         */
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
