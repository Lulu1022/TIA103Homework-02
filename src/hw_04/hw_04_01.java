package hw_04;

public class hw_04_01 {
    public static void main(String[] args) {
        /**
         * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
         * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
         */
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int avarage = 0;
        for (int i = 0; i < array.length; i++) {
            avarage = avarage + array[i];
        }
        avarage = avarage / array.length;
        System.out.println("平均數: " + avarage);
        System.out.print("大於平均數: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] > avarage){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        /**
         *請建立一個字串,經過程式執行後,輸入結果是反過來的
         * 例如String s = “Hello World”,執行結果即為dlroW olleH
         */
        String s = "Hello World";
        StringBuilder ans = new StringBuilder(s).reverse();
        System.out.println(ans);

        /**
         * 有個字串陣列如下 (八大行星):
         * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
         * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
         */
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        String vowels = "aeiou";
        int count = 0;
        for(String plant: planets){
            for (int i = 0; i < plant.length(); i++) {
                String c = String.valueOf(plant.charAt(i));
                if(vowels.contains(c)){
                    count ++;
                }
            }
        }
        System.out.println("母音總數: " + count);

    }

}
