package hashSet_tasks;

import java.util.HashSet;

/**
 * 1. HashSet из растений
 *
 * Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 */

public class HashSetHerbs {

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("арбуз");
        mySet.add("банан");
        mySet.add("вишня");
        mySet.add("груша");
        mySet.add("дыня");
        mySet.add("ежевика");
        mySet.add("жень-шень");
        mySet.add("земляника");
        mySet.add("ирис");
        mySet.add("картофель");

        for (String veggie: mySet) {
            System.out.println(veggie);
        }
    }
}
