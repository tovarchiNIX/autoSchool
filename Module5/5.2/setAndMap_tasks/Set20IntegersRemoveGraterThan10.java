package setAndMap_tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 13. Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 */

public class Set20IntegersRemoveGraterThan10 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size() != 20) {
            Integer randomNumber = new Random().nextInt(0, 30);
            numbers.add(randomNumber);
        }
        System.out.println(numbers);

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer element = iterator.next();
            if(element > 10) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
