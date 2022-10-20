import figur.BaseFigure;
import figur.Circle;
import figur.Square;
import figur.Triangle;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Random;

public class Main {

    /**
     * В отдельном пакете figur нужно создать структуру классов и имплементировать необходимые методы.
     * Должен быть базовый абстрактный класс и его наследники.
     * Все функции должны быть реализованы.
     * В классе Main с главным методом main должно быть реализовано задание.
     *
     * Описание класов:
     * Создать структуру классов для круга, квадрата и треугольника. Каждый из них должен иметь следующие свойства
     * (private) и методы (public)
     * - имя
     * - координаты
     * - функцию получения координат
     * - функцию расчета площади
     *
     * Задание
     * В функции main должны быть рeализованы следующие пункты:
     * - создания массива рандомных фигур размером в 10 элементов.
     * - сортировка фигур по площади (ASC/DESC - не важно)
     * - вывести отсортированный массив на консоли в виде : Имя, S=площадь
     */

    public static void main(String[] args) {
        // Количество фигур для построения
        int figuresToCreate = 10;

        // Создание массива фигур трех разных типов
        BaseFigure[] figures = createNewFigures(figuresToCreate);

        // Вывод на консоль всей информации о каждой неотсортированной фигуре (не по заданию)
        LinkedHashMap<String, Object> figuresInfo = getFiguresInfo(figures);
        System.out.println("Несортированные фигуры" + figuresInfo);

        /** Создание массива из фигур, отсортированных по площади в порядке возрастания и вывод на консоль нужной
         * информации (по заданию)
         */
        BaseFigure[] sortedFigures = sortFiguresByArea(figures);
        printFiguresInfo(sortedFigures);

        // Вывод всей информации по каждой отсортированной фигуре на консоль (не по заданию)
        LinkedHashMap<String, Object> sortedFiguresInfo = getFiguresInfo(sortedFigures);
        System.out.println("Отсортированные фигуры" + sortedFiguresInfo);
    }

    /**
     * @param amount количество фигур, которые мы желаем создать
     * @return массив случайных фигур
     */
    private static BaseFigure[] createNewFigures(int amount) {
        BaseFigure[] figures = new BaseFigure[amount];
        int[] uniqueFigures = {1, 2, 3};
        for (int i = 0; i < amount; i++) {
            int randomNumber = uniqueFigures[new Random().nextInt(uniqueFigures.length)];
            switch (randomNumber) {
                case 1:
                    figures[i] = new Circle();
                    break;
                case 2:
                    figures[i] = new Square();
                    break;
                case 3:
                    figures[i] = new Triangle();
                    break;
            }
        }
        return figures;
    }

    /**
     * @param figuresArr массив фигур, для которых мы желаем получить всю информацию
     * @return массив объектов, в котором содержится вся информация по каждой фигуре
     */
    private static LinkedHashMap<String, Object> getFiguresInfo(BaseFigure[] figuresArr) {
        LinkedHashMap<String, Object> figuresInfo = new LinkedHashMap<>();
        for (int i = 0; i < figuresArr.length; i++) {
            LinkedHashMap<String, Object> temp = new LinkedHashMap<>();
            if (figuresArr[i] instanceof Circle) {
                temp.put("Figure Type", "Circle");
            } else if (figuresArr[i] instanceof Square) {
                temp.put("Figure Type", "Square");
            } else {
                temp.put("Figure Type", "Triangle");
            }
            temp.put("Figure Name", figuresArr[i].getName());
            temp.put("Figure Area", String.valueOf(figuresArr[i].getArea()));
            temp.put("Coordinates", Arrays.deepToString(figuresArr[i].getCoordinates()));
            figuresInfo.put("Figure "+i, temp);
        }
        return figuresInfo;
    }

    /**
     * @param figuresArr массив фигур, которые мы желаем отсортировать по площади в порядке возрастания
     * @return отсортированный массив фигур
     */
    private static BaseFigure[] sortFiguresByArea(BaseFigure[] figuresArr) {
        boolean sortingStatus = false;
        while(!sortingStatus) {
            sortingStatus = true;
            for (int i = 0; i < figuresArr.length-1; i++) {
                if(figuresArr[i].getArea() > figuresArr[i+1].getArea()) {
                    sortingStatus = false;
                    BaseFigure temp = figuresArr[i];
                    figuresArr[i] = figuresArr[i+1];
                    figuresArr[i+1] = temp;
                }
            }
        }
        return figuresArr;
    }

    /**
     * @param figuresArr массив фигур, по которым мы желаем получить только ограниченную информацию (по заданию)
     */
    private static void printFiguresInfo(BaseFigure[] figuresArr) {
        for (BaseFigure figure : figuresArr) {
            System.out.println(figure.getName() + ", " + "S=" + figure.getArea());
        }
    }
}
