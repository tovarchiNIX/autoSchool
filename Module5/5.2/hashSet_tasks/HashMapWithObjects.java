package hashSet_tasks;

import hashSet_tasks.cats.Cat;

import java.util.HashMap;
import java.util.Map;

/**
 * 6. Коллекция HashMap из Object
 *
 * Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * Sim - 5
 */

public class HashMapWithObjects {
    public static void main(String[] args) {
        HashMap<String, Object> myMap = new HashMap<>();
        Integer obj1 = 1;
        Integer obj2 = 2;
        Integer obj3 = 3;
        Integer obj4 = 4;
        Integer obj5 = 5;
        Integer obj6 = 6;
        Integer obj7 = 7;
        Integer obj8 = 8;
        String obj9 = "строка";
        Cat obj10 = new Cat("Simon");

        myMap.put("один", obj1);
        myMap.put("два", obj2);
        myMap.put("три", obj3);
        myMap.put("четыре", obj4);
        myMap.put("пять", obj5);
        myMap.put("шесть", obj6);
        myMap.put("семь", obj7);
        myMap.put("восемь", obj8);
        myMap.put("string", obj9);
        myMap.put("кот", obj10);

        for (Map.Entry<String, Object> numRecord : myMap.entrySet()) {
            System.out.println(numRecord);
        }
    }
}
