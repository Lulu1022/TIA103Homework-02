package hw_07;

import file.Cat;
import file.Dog;

import java.io.*;

public class hw_07_04 {
    /**
     * 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
     * 意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
     */
    public static void main(String[] args) {

        String pathSrc1 = "src/file/Dog.ser";
        String pathSrc2 = "src/file/Cat.ser";
        String pathDes = "C:/data/Object.ser";
        Dog dog1 = new Dog("dog1");
        Cat cat1 = new Cat("cat1");
        Dog dog2 = new Dog("dog2");
        Cat cat2 = new Cat("cat2");

        // 確保目錄存在
        File directory = new File("C:/data");
        if (!directory.exists()) {
            directory.mkdirs(); // 創建資料夾
        }
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(pathDes));
            outputStream.writeObject(dog1);
            outputStream.writeObject(dog2);
            outputStream.writeObject(cat1);
            outputStream.writeObject(cat2);
            System.out.println("物件已成功寫入至 " + pathDes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
