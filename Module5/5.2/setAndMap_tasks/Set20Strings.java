package setAndMap_tasks;

import java.util.HashSet;
import java.util.Set;

/**
 * 12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 */

public class Set20Strings {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("лабиринт");
        strings.add("лаборант");
        strings.add("лаборатория");
        strings.add("лабрадор");
        strings.add("лава");
        strings.add("лаванда");
        strings.add("лаваш");
        strings.add("лавка");
        strings.add("лавра");
        strings.add("лавсан");
        strings.add("лагерь");
        strings.add("лагуна");
        strings.add("ладья");
        strings.add("лазарет");
        strings.add("лазер");
        strings.add("лазурь");
        strings.add("лайнер");
        strings.add("лакмус");
        strings.add("лакрица");
        strings.add("лактоза");
        System.out.println(strings);
    }
}
