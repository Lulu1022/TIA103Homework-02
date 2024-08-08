package hw_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable<Train>{
    /**
     * • 請設計一個Train類別,並包含以下屬性:
     * - 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
     * - 目的地 dest,型別為String - 票價 price,型別為double
     */
    int number;
    String type;
    String start;
    String dest;
    double price;

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public Train(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Train train = (Train) obj;
        return number == train.number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }
    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }

    public List<Train> getAllTrains(){
        Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train train3 = new Train(118, "自強", "高雄", "台北", 500);
        Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
        Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
        Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
        Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train train8 = new Train(1254, "區間", "屏東", "基隆", 700); // 放一個重複的做測試

        // 將 Train 物件放入集合中
        List<Train> trains = new ArrayList<Train>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);
        trains.add(train7);
        trains.add(train8);

        return trains;
    }

    @Override
    public int compareTo(Train other) {
        return Integer.compare(other.number, this.number); // 倒序排序
    }

}
