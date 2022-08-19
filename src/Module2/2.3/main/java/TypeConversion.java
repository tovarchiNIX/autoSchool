public class TypeConversion {

    /***
     * 1. В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления
     * q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5
     * в остатке
     *
     * 2. В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран
     * сумму цифр числа n.
     *
     * 3. В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую
     * число n до ближайшего целого и выводящую результат на экран.
     *
     * 4. Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
     * в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
     * Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7
     *
     */

    private static int a = 0;
    private static int b = 2;
    private static int c = 5;

    public static void main(String[] args) {

        // 1.
        int q = 21;
        int w = 8;
        int division = q / w;
        int divMod = q % w;
        System.out.println("\nРезультат деления q на w: " + division + " и " + divMod + " в остатке");

        // 2.
        int n = 87;
        String str = Integer.toString(n);
        int charIndex1 = Character.getNumericValue(str.charAt(0));
        int charIndex2 = Character.getNumericValue(str.charAt(1));
        int charsSum = charIndex1 + charIndex2;
        System.out.println("\nСумма чисел двузначного числа n: " + charsSum);

        // 3.
        float f = 431.128f;
        int cast = (int)f;
        System.out.println("\nОкругление дробного числа до целой части можно добиться преобразованием в int: " + cast);

        // 4.
        TypeConversion obj = new TypeConversion();
        obj.setNewValues(a, b, c);
        System.out.println("\nНовое значение a: " + a
                + " \nНовое значение b: " + b
                + " \nНовое значение c: " + c);
    }

    private void setNewValues(int num1, int num2, int num3) {
        a = num1 + num2;
        b = num3 - num1;
        c = num1 + num2 + num3;
    }
}
