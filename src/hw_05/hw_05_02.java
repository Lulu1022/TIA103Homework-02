package hw_05;

public class hw_05_02 {
    /**
     * 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
     */
    public static void main(String[] args) {
        hw_05_02 hw0502 = new hw_05_02();
        hw0502.randAvg();
    }
    public void randAvg(){
        int[] array = new int[10];
        double total = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.print(array[i] + ",");
            total = total + array[i];
        }
        System.out.println();
        double avg = total/ array.length;
        System.out.println(avg);


    }
}
