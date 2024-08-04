package hw_07;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.*;

public class hw_07_01 {
    /**
     * 請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
     * Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
     */
    public static void main(String[] args) {
        String path = "src/file/Sample.txt";
        int byteCount = 0;
        int charCount = 0;
        int lineCount = 0;
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ( (line = bufferedReader.readLine()) != null){
                byteCount += line.getBytes(UTF_8).length;
                charCount = charCount + line.length();
                lineCount = lineCount + 1;
            }
            String result = String.format("檔案共有%d個位元組,%d個字元,%d列資料", byteCount, charCount, lineCount);
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
