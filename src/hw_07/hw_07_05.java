package hw_07;

import file.Cat;
import file.Dog;

import java.io.*;

public class hw_07_05 {
    /**
     * 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
     * 型簡化本題的程式設計)
     */
    public static void main(String[] args) {
        String path = "C:/data/Object.ser";
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
            Object obj;
            try {
                while (true) {
                    obj = objectInputStream.readObject();
                    if (obj instanceof Cat) {
                        ((Cat) obj).speak();
                    } else if (obj instanceof Dog) {
                        ((Dog) obj).speak();
                    } else {
                        System.out.println("未知的物件類型。");
                    }
                }
            } catch (IOException e) {
                System.out.println("資料讀取完畢");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
