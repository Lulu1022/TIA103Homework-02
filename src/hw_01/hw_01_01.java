package hw_01;

public class hw_01_01 {
    public static void main(String[] args) {
        /**
         * 第一題：計算12、6這兩個數值的和與積
         */
        System.out.println("====== 第一題 ======");
        int a = 12;
        int b = 6;
        int sum = a + b;
        int product = a * b;

        System.out.println("合: " + sum);
        System.out.println("積: " + product);

        /**
         * 第二題 : 計算200顆蛋共是幾打幾顆？（一打為12顆）
         */
        System.out.println("====== 第二題 ======");
        int totalEggs = 200;
        int dozens = totalEggs / 12;
        int remainingEggs = totalEggs % 12;

        System.out.println(dozens + "打");
        System.out.println(remainingEggs + "顆");

        /**
         *  第三題 : 算出256559秒為多少天、多少小時、多少分鐘與多少秒
         */
        System.out.println("====== 第三題 ======");
        int totalSeconds = 256559;

        int days = totalSeconds / (24 * 3600);
        int hours = (totalSeconds % (24 * 3600)) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(days + "天");
        System.out.println(hours + "小時");
        System.out.println(minutes + "分鐘");
        System.out.println(seconds + "秒");

        /**
         * 第四題 : 定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
         */
        System.out.println("====== 第四題 ======");
        final double PI = 3.1415;
        int radius = 5;

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;


        System.out.println("面積: " + area);
        System.out.println("圓周長: " + circumference);

        /**
         * 第五題 : 在銀行存入150萬，銀行利率為2%。如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢
         */
        System.out.println("====== 第五題 ======");
        double principal = 1500000;
        double rate = 0.02;
        int years = 10;

        double amount = principal * Math.pow((1 + rate), years);

        System.out.println( years + " 年後" + "總共 " + amount + " 元");

        /**
         * 第六題 : 利用System.out.println()印出以下三個運算式結果
         */
        System.out.println("====== 第六題 ======");
        System.out.println(5 + 5);    // 5 + 5 結果是 10，因為是兩個整數相加。
        System.out.println(5 + '5');  // 5 + '5' 結果是 58，因為 '5' 的 ASCII 值是 53，加上 5 就是 58。
        System.out.println(5 + "5");  // 5 + "5" 結果是 55，因為是整數和字符串進行串聯。
    }


}