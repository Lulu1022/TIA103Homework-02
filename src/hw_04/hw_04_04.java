package hw_04;

import java.util.Arrays;

public class hw_04_04 {
    public static void main(String[] args) {
        /**
         * 班上有8位同學,他們進行了6次考試結果如下
         * 請算出每位同學考最高分的次數
         */

        int[][] scores = {
                {10, 35, 40, 100, 90, 85, 75, 70}, // 第一次考試
                {37, 75, 77, 89, 64, 75, 70, 95},  // 第二次考試
                {100, 70, 79, 90, 75, 70, 79, 90}, // 第三次考試
                {77, 95, 70, 89, 60, 75, 85, 89},  // 第四次考試
                {98, 70, 89, 90, 75, 90, 89, 90},  // 第五次考試
                {90, 80, 100, 75, 50, 20, 99, 75}  // 第六次考試
        };
        int[] record = new int[8];

        for (int test = 0; test < scores.length; test++) {
            int max = scores[test][0];
            int maxIndex = 0;
            for (int student = 0; student < scores[test].length; student++) {
                if(scores[test][student] > max){
                    max = scores[test][student];
                    maxIndex = student;
                }
            }
            record[maxIndex] = record[maxIndex] + 1;
        }
        for (int i = 0; i < record.length; i++) {
            int numberOfStuendt = 0;
            numberOfStuendt = i + 1;
            System.out.println("第" + numberOfStuendt + "位最高分次數: " + record[i]);
        }

    }
}
