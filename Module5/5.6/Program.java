import family.Child1;
import family.Child2;
import family.Child3;
import family.Parent;
import java.lang.reflect.Field;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();

        Program.setAllFields(c1);
        Program.setAllFields(c2);
        Program.setAllFields(c3);

        Parent.printAllClassFields(c1);
        Parent.printAllClassFields(c2);
        Parent.printAllClassFields(c3);
    }

    private static void setAllFields(Parent o) {
            Field[] classFields = o.getClass().getDeclaredFields();
            for (Field f : classFields) {
                f.setAccessible(true);
                try {
                    f.set(o, stringGenerator());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
    }

    private static String stringGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = new Random().nextInt(5, 10);

        return new Random().ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
