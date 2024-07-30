package hw_05;

public class hw_05_01 {
    /**
     * 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
     * 圖:
     */
    public static void main(String[] args) {
        hw_05_01 hw0501 = new hw_05_01();
        hw0501.starSquare(5,4);
    }
    public void starSquare(int width, int height){
        System.out.println(width + "," + height);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
