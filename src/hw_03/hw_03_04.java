package hw_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hw_03_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 建立1到49的數字列表
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }

        // 讓阿文輸入他不想要的數字
        System.out.print("阿文，請輸入你討厭的數字（1到9）：");
        int dislikedNumber = scanner.nextInt();

        // 移除所有包含不喜歡數字的數字
        numbers.removeIf(num -> String.valueOf(num).contains(String.valueOf(dislikedNumber)));

        // 顯示剩餘的數字
        System.out.println("剩餘的數字是：");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 打亂並選取6個隨機數字
        Collections.shuffle(numbers);
        List<Integer> selectedNumbers = numbers.subList(0, 6);

        // 顯示選取的6個數字
        System.out.println("選取的6個隨機數字是：");
        for (int num : selectedNumbers) {
            System.out.print(num + " ");
        }

    }
}
