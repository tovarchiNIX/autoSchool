package hashSet_tasks;

import hashSet_tasks.cats.Cat;
import java.util.HashMap;
import java.util.Map;

/**
 * 3. Коллекция HashMap из котов
 *
 * Есть класс Cat, с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 */

public class HashMapCats {
    public static void main(String[] args) {
        HashMap<String, Cat> cats = new HashMap<>();
        Cat cat1 = new Cat("Luna");
        Cat cat2 = new Cat("Milo");
        Cat cat3 = new Cat("Oliver");
        Cat cat4 = new Cat("Leo");
        Cat cat5 = new Cat("Loki");
        Cat cat6 = new Cat("Bella");
        Cat cat7 = new Cat("Charlie");
        Cat cat8 = new Cat("Willow");
        Cat cat9 = new Cat("Lucy");
        Cat cat10 = new Cat("Simba");

        cats.put(cat1.getName(), cat1);
        cats.put(cat2.getName(), cat2);
        cats.put(cat3.getName(), cat3);
        cats.put(cat4.getName(), cat4);
        cats.put(cat5.getName(), cat5);
        cats.put(cat6.getName(), cat6);
        cats.put(cat7.getName(), cat7);
        cats.put(cat8.getName(), cat8);
        cats.put(cat9.getName(), cat9);
        cats.put(cat10.getName(), cat10);

        for (Map.Entry<String, Cat> catRecord : cats.entrySet()) {
            System.out.println(catRecord);
        }
    }
}
