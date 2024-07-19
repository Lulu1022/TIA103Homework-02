package hw_02;

public class hw_02_01 {
    public static void main(String[] args) {
        /**
         * • 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
         * • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
         * • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
         * • 請設計一隻Java程式,輸出結果為以下:
         * 1 4 9 16 25 36 49 64 81 100
         */
        System.out.println("======第一題======");
        int sum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("======第二題======");
        int product1 = 1;
        for (int i = 1; i <11 ; i++) {
            product1 = product1 * i;
        }
        System.out.println(product1);

        System.out.println("======第三題======");
        int product2 = 1;
        int k = 1;
        while (k <= 10){
            product2 = product2 * k;
            k++;
        }
        System.out.println(product2);

        /**
         * 請設計一隻Java程式,輸出結果為以下:
         * 1 2 3 4 5 6 7 8 9 10
         * 1 2 3 4 5 6 7 8 9
         * 1 2 3 4 5 6 7 8
         * 1 2 3 4 5 6 7
         * 1 2 3 4 5 6
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        System.out.println("======第四題======");

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /**
         * 請設計一隻Java程式,輸出結果為以下:
         * A
         * BB
         * CCC
         * DDDD
         * EEEEE
         * FFFFFF
         */
        System.out.println("======第五題======");
        char letter = 'A';
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            letter++;
            System.out.println();
        }
    }
}
