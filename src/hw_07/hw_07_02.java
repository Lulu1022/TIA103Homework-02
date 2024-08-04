package hw_07;

import java.io.*;
import java.util.Random;

public class hw_07_02 {
    /**
     * 請寫一隻程式,能夠亂數產生10個1〜1000的整數,並寫入一個名為Data.txt的檔案裡(請使用
     * append功能讓每次執行結果都能被保存起來)
     */
    public static void main(String[] args) {
        Random random = new Random();
        String path = "src/file/hw_07_02.txt";
        try {
            BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path,true),"UTF-8"));
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(1000) + 1; // 生成 1 到 1000 之間的數字
                writer.write(num + System.lineSeparator()); // 將數字轉為字符串並寫入文件
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
