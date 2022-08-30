import java.util.Scanner;

public class ThreeArrays {

    /**
     * Один большой массив и два маленьких
     *
     * 1. Создать массив на 20 чисел.
     * 2. Ввести в него значения с клавиатуры.
     * 3. Создать два массива на 10 чисел каждый.
     * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во
     * второй маленький.
     * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
     */

    public static void main(String[] args) {
        int[] bigArray = createBigArray();
        int[][] twoSmallArrays = copyArrayToArrays(bigArray);
        printArray(twoSmallArrays[1]);
    }

    private static int[] createBigArray() {
        int[] bigArray = new int[20];
        int length = bigArray.length;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.println("Введите значение " + (i + 1) + " из " + length);
            bigArray[i] = Integer.parseInt(scanner.nextLine());
        }
        return bigArray;
    }

    private static int[][] copyArrayToArrays(int[] array) {
        int[][] arrayOfArrays = {new int[10], new int[10]};
        for (int i = 0; i < arrayOfArrays[0].length; i++) {
            arrayOfArrays[0][i] = array[i];
        }
        for (int i = 0; i < arrayOfArrays[1].length; i++) {
            arrayOfArrays[1][i] = array[i + arrayOfArrays[0].length];
        }
        return arrayOfArrays;
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }
}
