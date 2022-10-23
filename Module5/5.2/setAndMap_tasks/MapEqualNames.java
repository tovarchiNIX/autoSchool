package setAndMap_tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 16. Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 * Удалить людей, имеющих одинаковые имена.
 */

public class MapEqualNames {
    public static void main(String[] args) {
        Map<String, String> peopleNames = new HashMap<>();
        peopleNames.put("Wahlberg","Mark");
        peopleNames.put("White","Betty");
        peopleNames.put("Douglas","Michael");
        peopleNames.put("Williams","Robin");
        peopleNames.put("Connery","Sean");
        peopleNames.put("Bullock","Sandra");
        peopleNames.put("Ball","Lucille");
        peopleNames.put("Anthony","Mark");
        peopleNames.put("Walberg","Mark");
        peopleNames.put("Keaton","Michael");
        removeEqualNames(peopleNames);
        System.out.println(peopleNames);
    }

    private static void removeEqualNames(Map<String, String> map) {
        // Создаем новую карту, в которую будем складывать все записи с дублирующимися значениями из главной карты
        Map<String, String> equalNames = new HashMap<>();

        // Создаем итератор по главной карте
        Iterator<Map.Entry<String, String>> mainMapIterator1 = map.entrySet().iterator();

        while (mainMapIterator1.hasNext()) {
            // Создаем объект пары для главной карты и второй итератор по главной карте
            Map.Entry<String, String> mainMapEntry1 = mainMapIterator1.next();
            Iterator<Map.Entry<String, String>> mainMapIterator2 = map.entrySet().iterator();

            while (mainMapIterator2.hasNext()) {
                /*
                 * Создаем второй объект пары для главной карты и проводим сравнение двух пар. В случае, когда есть
                 * полное совпадение пар по ключам и значениям, мы игнорируем этот случай, и стартуем новую итерацию
                 * проверки
                  */
                Map.Entry<String, String> mainMapEntry2 = mainMapIterator2.next();
                if (mainMapEntry1.getKey().equals(mainMapEntry2.getKey()) &&
                        mainMapEntry1.getValue().equals(mainMapEntry2.getValue())) {
                    continue;
                    /*
                     * В случае, когда есть совпадение пар только по значениям, мы добавляем такую пару во временную
                     * карту
                     */
                } else if (mainMapEntry1.getValue().equals(mainMapEntry2.getValue())) {
                    equalNames.put(mainMapEntry2.getKey(), mainMapEntry2.getValue());
                }
            }
        }

        /*
         * Сравниваем записи из временной карты и главной карты и в случае полного совпадения по ключам и значениям,
         * мы удаляем такую запись из главной карты
         */
        for (Iterator<Map.Entry<String, String>> mainMapIterator = map.entrySet().iterator();
             mainMapIterator.hasNext();) {
            Map.Entry<String, String> mainMapEntry = mainMapIterator.next();
            for (Iterator<Map.Entry<String, String>> tempMapIterator = equalNames.entrySet().iterator();
                 tempMapIterator.hasNext();) {
                Map.Entry<String, String> tempMapEntry = tempMapIterator.next();
                if (mainMapEntry.getKey().equals(tempMapEntry.getKey()) &&
                        mainMapEntry.getValue().equals(tempMapEntry.getValue())) {
                    mainMapIterator.remove();
                }
            }
        }
    }
}
