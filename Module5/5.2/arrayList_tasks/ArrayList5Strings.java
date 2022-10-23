package arrayList_tasks;

import java.util.ArrayList;

/**
 * 7. 5 различных строчек в списке
 *
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строчек.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки
 */

public class ArrayList5Strings {
    public static void main(String[] args) {
        ArrayList<String> fingers = new ArrayList<>();
        fingers.add("большой");
        fingers.add("указательный");
        fingers.add("средний");
        fingers.add("безымянный");
        fingers.add("мизинец");
        System.out.println(fingers);

        for (String finger: fingers) {
            System.out.println(finger);
        }
    }
}
