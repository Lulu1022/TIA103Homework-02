package hw_05;

import java.util.Arrays;

public class hw_05_05 {
    /**
     * 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
     * genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
     * 與數字的亂數組合,如圖:
     */
    public static void main(String[] args) {
        hw_05_05 hw0505 = new hw_05_05();
        System.out.println(hw0505.genCode());
    }


    public String genCode() {
        final String charString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] array = new char[8];
        for (int i = 0; i < 8; i++) {
            int index = (int)(Math.random() * 62) + 1;
            array[i] = charString.charAt(index);
        }
        return Arrays.toString(array);
    }
}
