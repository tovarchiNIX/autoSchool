import java.util.Scanner;

public class Task3 {

    /**
     * 3 Ввести с клавиатуры три числа, и вывести их в порядке убывания.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        /**
         *  A B C
         *  A C B
         *  B A C
         *  B C A
         *  C A B
         *  C B A
         */

        if(a > b && b > c) {
            System.out.println(a + " больше " + b + " больше " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " больше " + c + " больше " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " больше " + a + " больше " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " больше " + c + " больше " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " больше " + a + " больше " + b);
        } else if (c > b && b > a) {
            System.out.println(c + " больше " + b + " больше " + a);
        } else {
            System.out.println("Числа должны отличаться");
        }
    }
}
