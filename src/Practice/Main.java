package Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // 使用 Collections.sort 進行排序
        Collections.sort(people);

        // 輸出排序後的結果
        for (Person person : people) {
            System.out.println(person);
        }
    }
}