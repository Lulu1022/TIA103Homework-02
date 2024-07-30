package hw_05;

public class hw_05_03 {
    /**
     * 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
     * 可以找出二維陣列的最大值並回傳,如圖:
     */
    public static void main(String[] args) {
        int[][] intArray = {
                {1,6,3},
                {9,5,2}
        };
        double[][] doubleArray = {
                {1.2,3.5,2.2},
                {7.4,2.1,8.2}
        };
        hw_05_03 hw0503 = new hw_05_03();
        System.out.println(hw0503.maxElement(intArray));
        System.out.println(hw0503.maxElement(doubleArray));
    }
    public int maxElement(int x[][]){
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(x[i][j] > max){
                    max = x[i][j];
                }
            }
        }
        return max;
    }
    public double maxElement(double x[][]){
        double max = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(x[i][j] > max){
                    max = x[i][j];
                }
            }
        }
        return max;
    }
}
