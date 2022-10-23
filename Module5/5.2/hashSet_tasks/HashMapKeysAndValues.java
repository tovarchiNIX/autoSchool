package hashSet_tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * 4. Вывести на экран список ключей
 *
 * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 */

public class HashMapKeysAndValues {
    public static void main(String[] args) {
        HashMap<String, String> mYMap = new HashMap<>();
        mYMap.put("1", "Харьков");
        mYMap.put("2", "Одесса");
        mYMap.put("3", "Львов");
        mYMap.put("4", "Тернополь");
        mYMap.put("5", "Житомир");
        mYMap.put("6", "Киев");
        mYMap.put("7", "Днепр");
        mYMap.put("8", "Черкассы");
        mYMap.put("9", "Винница");
        mYMap.put("10", "Николаев");

        for (Map.Entry<String, String> cityRecord : mYMap.entrySet()){
            System.out.println(cityRecord.getKey());
        }

        /**
         * 5. Вывести на экран список значений
         *
         * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
         * Вывести на экран список значений, каждый элемент с новой строки.
         */

        for (Map.Entry<String, String> cityRecord : mYMap.entrySet()){
            System.out.println(cityRecord.getValue());
        }
    }
}
