package family;

import java.lang.reflect.Field;

public class Parent {

    public Parent() {

    }

    public static void printAllClassFields(Parent o) {
            Field[] classFields = o.getClass().getDeclaredFields();
            String fieldName;
            String fieldValue = null;
            for (Field f : classFields) {
                fieldName = f.getName();
                f.setAccessible(true);
                try {
                    fieldValue = (String) f.get(o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.out.println(fieldName+" "+fieldValue);
            }
    }
}
