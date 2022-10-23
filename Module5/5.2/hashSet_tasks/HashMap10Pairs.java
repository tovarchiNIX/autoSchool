package hashSet_tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * 2. HashMap из 10 пар
 *
 * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава,
 * вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода,
 * ирис – цветок, картофель – клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * картофель – клубень
 */

public class HashMap10Pairs {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("арбуз", "ягода");
        myHashMap.put("банан", "трава");
        myHashMap.put("вишня", "ягода");
        myHashMap.put("груша", "фрукт");
        myHashMap.put("дыня", "овощ");
        myHashMap.put("ежевика", "куст");
        myHashMap.put("жень-шень", "корень");
        myHashMap.put("земляника", "ягода");
        myHashMap.put("ирис", "цветок");
        myHashMap.put("картофель", "клубень");

        for (Map.Entry<String, String> record : myHashMap.entrySet()){
            System.out.println(record);
        }
    }
}
