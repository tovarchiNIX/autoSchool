package figure;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Point {
    private final float x;
    private final float y;

    public Point() {
        x = setRandomCoordinate();
        y = setRandomCoordinate();
    }

    /**
     * Этот конструктор используется для случаев, когда нам не подходит стандартный конструктор
     * (мы создаем точки из заранее известных координат)
     * @param coordinates массив координат, из которого мы присваиваем значение x и y
     */
    public Point(float[] coordinates) {
            this.x = coordinates[0];
            this.y = coordinates[1];
    }

    public float getXAxis() {
        return x;
    }

    public float getYAxis() {
        return y;
    }

    /**
     * @return случайное значение координаты из заданного диапазона
     */
    private float setRandomCoordinate() {
        float randomValue = new Random().nextFloat(-50f, 50f);
        return new BigDecimal(randomValue).setScale(3, RoundingMode.HALF_UP).floatValue();
    }
}
