import java.util.Scanner;

public class Task4 {

    /**
     * 4 Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
     * Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Имена идентичны");
        } else if (!(a.equalsIgnoreCase(b)) && a.length() == b.length()) {
            System.out.println("Длины имен равны");
        } else {
            System.out.println("Имена разные");
        }
    }
}
