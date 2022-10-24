import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно).
 *
 * Добавьте вручную несколько пустых элементов ""
 *
 * С помощью stream() выведите на консоль:
 *
 * длинну каждого из элементов списка.
 * не пустые элементы списка не содержащие символ d
 * элементы списка в алфавитном порядке.
 */

public class StreamDemo {
    public static void main(String[] args) {
        List<String> myList = listGenerator();
        myList.add("");
        myList.add("");
        myList.add("");
        myList.stream()
                .filter(s -> s.length() > 0 && !s.contains("d")) // не пустые элементы списка не содержащие символ d
                .sorted() // элементы списка в алфавитном порядке.
                .forEach(s -> System.out.println(s+" : "+s.length())); // длинну каждого из элементов списка.
    }

    private static String stringGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = new Random().nextInt(0, 20);

        return new Random().ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static List<String> listGenerator() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 47; i++) {
            list.add(stringGenerator());
        }
        return list;
    }
}
