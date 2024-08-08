package hw_08;

import java.util.List;

public class hw_08_02 {
    /**
     * • 請設計一個Train類別,並包含以下屬性:
     * - 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
     * - 目的地 dest,型別為String - 票價 price,型別為double
     * • 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
     * 需使用的集合裡
     * - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
     * - (1254, “區間”, “屏東”, “基隆”, 700)
     * - (118, “自強”, “高雄”, “台北”, 500)
     * - (1288, “區間”, “新竹”, “基隆”, 400)
     * - (122, “自強”, “台中”, “花蓮”, 600)
     * - (1222, “區間”, “樹林”, 七堵, 300)
     * - (1254, “區間”, “屏東”, “基隆”, 700)
     */
    public static void main(String[] args) {
        Train train = new Train();
        List<Train> allTrains = train.getAllTrains();
        System.out.println(allTrains);
    }
}
