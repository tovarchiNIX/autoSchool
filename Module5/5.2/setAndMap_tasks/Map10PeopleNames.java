package setAndMap_tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 14. Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
 * Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */

public class Map10PeopleNames {
    public static void main(String[] args) {

        Map<String, String> people = new HashMap<>();
        people.put("Wayne","Rooney");
        people.put("Seydou","Keita");
        people.put("Cristiano","Ronaldo");
        people.put("Jordan","Lukaku");
        people.put("Thierry","Henry");
        people.put("Henry","Martin");
        people.put("Romelu","Lukaku");
        people.put("Ronaldo","Nazario");
        people.put("Naby","Keita");
        people.put("Adam","Rooney");
        findCoincidence(people, "Rooney");

    }

    private static void findCoincidence(Map<String, String> map, String nameOrSurname) {
        Set<Map.Entry<String, String>> allEntries = map.entrySet();
        Set<Map.Entry<String, String>> coincidences = new HashSet<>();
        int count = 0;
        for (Map.Entry<String, String> record : allEntries) {
            if (record.getKey().equals(nameOrSurname) || record.getValue().equals(nameOrSurname)) {
                coincidences.add(record);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Найдено "+count+" совпадений");
        } else {
            System.out.println("Найдено "+count+" совпадений"+"\n"+coincidences);
        }
    }
}
