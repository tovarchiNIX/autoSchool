public class Task12 {

    /**
     * 12 Вывести на экран таблицу умножения 10х10 используя цикл while.
     *
     * Числа разделить пробелом.
     *
     * Example output:
     *
     * 1 2 3 4 5 6 7 8 9 10
     *
     * 2 4 6 8 10 12 14 16 18 20
     *
     * 3 6 9 12 15 18 21 24 27 30
     */

    public static void main(String[] args) {
        int multiplier = 1;
        while (multiplier <= 10) {
            int multiplicand = 1;
            while (multiplicand <= 10) {
                System.out.print(multiplier * multiplicand + " ");
                multiplicand++;
            }
            System.out.println("\n");
            multiplier++;
        }
    }
}
