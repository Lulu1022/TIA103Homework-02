package hw_08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class hw_08_03 {
    /**
     * • 請寫一隻程式,能印出不重複的Train物件
     *
     * • 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
     *
     * • 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
     *
     * • (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
     */
    public static void main(String[] args) {
        Train train = new Train();
        List<Train> trainList = train.getAllTrains();
        HashSet<Train> trainSet = new HashSet<>(trainList);

        System.out.println("====== 使用 for======");
        List<Train> newTrainList = new ArrayList<>(trainSet);
        for (int i = 0; i < newTrainList.size(); i++) {
            System.out.println(newTrainList.get(i));
        }

        System.out.println("====== 使用 foreach ======");
        for(Train item: newTrainList){
            System.out.println(item);
        }

       System.out.println("====== 使用 iterator ======");
        Iterator<Train> trainIterator = newTrainList.iterator();
        while (trainIterator.hasNext()) {
            Train t = trainIterator.next();
            System.out.println(t);
        }

    }
}
