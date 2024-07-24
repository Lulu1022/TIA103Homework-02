package hw_04;

import java.util.Scanner;

public class hw_04_03 {
    public static void main(String[] args) {
        /**
         * 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
         *
         * 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
         */

            Scanner scanner = new Scanner(System.in);


            int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


            System.out.print("請輸入年份 (yyyy): ");
            int year = scanner.nextInt();

            System.out.print("請輸入月份 (mm): ");
            int month = scanner.nextInt();

            System.out.print("請輸入日期 (dd): ");
            int day = scanner.nextInt();


            if (month < 1 || month > 12) {
                System.out.println("月份輸入錯誤，應在1到12之間。");
                return;
            }


            if (isLeapYear(year)) {
                daysInMonth[1] = 29;
            }


            if (day < 1 || day > daysInMonth[month - 1]) {
                System.out.println("日期輸入錯誤，該月份的天數應在1到" + daysInMonth[month - 1] + "之間。");
                return;
            }


            int dayOfYear = 0;
            for (int i = 0; i < month - 1; i++) {
                dayOfYear = dayOfYear + daysInMonth[i];
            }
            dayOfYear += day;

            System.out.println("輸入的日期為該年的第 " + dayOfYear + " 天");

    }

    /**
     * year % 4 == 0 && year % 100 != 0 確保年份是4的倍數但不是100的倍數（這樣才是閏年）。
     * year % 400 == 0 確保年份是400的倍數（這樣也是閏年）。
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
