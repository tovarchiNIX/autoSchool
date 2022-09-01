public class Task11 {

    /**
     * 11 Вывести на экран квадрат из 10х10 букв S используя цикл while.
     *
     * Буквы в каждой строке не разделять.
     */

    public static void main(String[] args) {
        int i = 1;
        int end = 10;
        while (i <= end) {
            int j = 1;
            while(j <= end) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
