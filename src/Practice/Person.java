package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 定義一個實作 Comparable 介面的類別
class Person implements Comparable<Person> {
    private String name;
    private int age;

    // 建構子
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 實作 compareTo 方法
    @Override
    public int compareTo(Person other) {
        // 按年齡排序，從小到大
        if (this.age < other.age) {
            return -1;  // this 比 other 年齡小
        } else if (this.age > other.age) {
            return 1;   // this 比 other 年齡大
        } else {
            return 0;   // 年齡相同
        }
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}


