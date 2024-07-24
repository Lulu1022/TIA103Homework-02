package hw_04;

import java.util.Scanner;

public class hw_04_02 {
    public static void main(String[] args) {
        /**
         * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
         * 表如下:
         *員工編號	25	32	8	19	27
         * 身上現金	2500	800	500	1000	1200
         * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
         * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
         * 員工編號: 25 19 27 共 3 人!」
         */
        int[][] coworkers = {
                {25, 2500},
                {32, 800},
                {8, 500},
                {19, 1000},
                {27, 1200}
        };
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入欲借的金額: ");
        int num = scanner.nextInt();
        for (int i = 0; i < coworkers.length; i++) {
            if(coworkers[i][1] >= num){
                count++;
                stringBuilder.append(coworkers[i][0]);
            }
        }
        System.out.println("有錢可借的員工編號: " +  stringBuilder + " 共" + count + "人!");
    }
}
