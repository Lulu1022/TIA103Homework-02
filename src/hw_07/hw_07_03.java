package hw_07;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class hw_07_03 {
    /**
     *請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
     * 代表的檔案會複製到第二個參數代表的檔案
     */
    public static void main(String[] args) {
        hw_07_03.copyFile(
                new File("src/file/hw_07_03_source.txt"),
                new File("src/file/hw_07_03_des.txt"));
    }
    public static void copyFile(File sourceFile, File desFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), StandardCharsets.UTF_8));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(desFile)));

            String read;
            while ((read = bufferedReader.readLine()) != null) {
                bufferedWriter.write(read);  // 寫入讀取的行
                bufferedWriter.newLine();    // 寫入行分隔符
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
