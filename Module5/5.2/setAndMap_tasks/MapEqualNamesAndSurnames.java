package setAndMap_tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * 17.
 *
 * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
 * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
 * 4. Вывести содержимое Map на экран.
 */

public class MapEqualNamesAndSurnames {
    public static void main(String[] args) {
        Map<String, String> peopleNames = new HashMap<>();
        peopleNames.put("Wahlberg","Mark");
        peopleNames.put("White","Betty");
        peopleNames.put("Douglas","Michael");
        peopleNames.put("Williams","Robin");
        peopleNames.put("Connery","Sean");
        peopleNames.put("Connery","Paul");
        peopleNames.put("Ball","Lucille");
        peopleNames.put("Anthony","Mark");
        peopleNames.put("Walberg","Mark");
        peopleNames.put("Keaton","Michael");
        System.out.println(peopleNames);

        /**
         * В случаях, когда в карте есть повторяющиеся ключи, значение из записи "дубликата", перезапишет значение
         * "оригинала". Это будет восприниматься как обновление записи, а не две разные записи.
         *
         * Если же есть полное совпадение двух записей по ключу и значению, то это воспринимается как одна запись.
         */
    }
}
