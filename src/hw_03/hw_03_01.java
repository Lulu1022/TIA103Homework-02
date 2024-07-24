package hw_03;

import java.util.Scanner;

public class hw_03_01 {
    public static void main(String[] args) {
        /**
         * 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
         * 三角形、其它三角形或不是三角形,如圖示結果:
         */
        /**
         * (進階功能:加入直角三角形的判斷)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入三個整數：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            System.out.println("不是三角形");
        }

        scanner.close();
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

}
