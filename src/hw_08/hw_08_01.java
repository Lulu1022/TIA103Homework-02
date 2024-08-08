package hw_08;

import java.util.*;

public class hw_08_01 {
    /**
     * • 請建立一個Collection物件並將以下資料加入:
     * Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
     * Object物件、“Snoopy”、BigInteger(“1000”)
     *
     * • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
     * • 移除不是java.lang.Number相關的物件
     * • 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
     */
    public static void main(String[] args) {
        Collection<Object> arrayList = new ArrayList<Object>();
        arrayList.add(100);
        arrayList.add(3.14);
        arrayList.add(100);
        arrayList.add(5.1);
        arrayList.add("Kitty");
        arrayList.add(100);
        arrayList.add(new Object());
        arrayList.add("Snoopy");
        arrayList.add(1000);

        Iterator<Object> iterator = arrayList.iterator();
        // 印出所有元素：使用傳統 for
        System.out.println("======使用 for======");
        Object[] array = arrayList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 印出所有元素：使用 foreach
        System.out.println("======使用 foreach======");
        for (Object obj : arrayList) {
            System.out.println(obj);
        }

        // 移除非 java.lang.Number 相關的物件
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (!(obj instanceof Number)) {
                iterator.remove();
            }
        }
        System.out.println("======移除後結果======");
        for (Object obj : arrayList){
            System.out.println(obj);
        }


    }

}
