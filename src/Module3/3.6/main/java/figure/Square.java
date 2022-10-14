package figure;

import java.util.Random;
public class Square extends BaseFigure {

    private String name;
    private float area;
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Square() {
        a = new Point();
        c = new Point();
        b = new Point(getCoordinateForMissingPointB(getCoordinatesForCenterAndVector(a, c)));
        d = new Point(getCoordinateForMissingPointD(getCoordinatesForCenterAndVector(a, c)));
        name = setName();
        area = calculateArea();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getArea() {
        return area;
    }

    /**
     * @return массив координат всех точек фигуры
     */
    @Override
    public float[][] getCoordinates() {
        Point[] allPoints = new Point[]{a, b, c, d};
        float[][] coordinates = new float[allPoints.length][];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = new float[] {allPoints[i].getXAxis(), allPoints[i].getYAxis()};
        }
        return coordinates;
    }

    /**
     * @param a - точка а
     * @param c - точка с
     * @return массив координат центра отрезка ac, который мы принимаем за диагональ квадрата, а так же массив координат
     * вектора для построения недостающей точки
     */
    private float[][] getCoordinatesForCenterAndVector(Point a, Point c) {
        // Здесь находим координаты центра отрезка ac
        float centerX = (a.getXAxis() + c.getXAxis()) / 2;
        float centerY = (a.getYAxis() + c.getYAxis()) / 2;

        // Здесь находим координаты вектора от центра отрезка ab
        float vectorX = a.getXAxis() - centerX;
        float vectorY = a.getYAxis() - centerY;

        return new float[][]{{centerX, centerY}, {vectorX, vectorY}};
    }

    /**
     * @param centerAndVector - массив координат центра диагонали и массив координат вектора
     * @return массив координат точки b
     */
    private float[] getCoordinateForMissingPointB(float[][] centerAndVector) {
        float[] center = centerAndVector[0];
        float[] vector = centerAndVector[1];

        // Находим координаты недостающей точки b
        float bX = center[0] - vector[1];
        float bY = center[1] + vector[0];

        return new float[]{bX, bY};
    }

    /**
     * @param centerAndVector - массив координат центра диагонали и массив координат вектора
     * @return массив координат точки d
     */
    private float[] getCoordinateForMissingPointD(float[][] centerAndVector) {
        float[] center = centerAndVector[0];
        float[] vector = centerAndVector[1];

        // Находим координаты недостающей точки d
        float dX = center[0] + vector[1];
        float dY = center[1] - vector[0];
        return new float[]{dX, dY};
    }

    /**
     * @return значение площади квадрата
     */
    private float calculateArea() {
        // Площадь квадрата считается по формуле: S = 1/2 * (D)2
        float diagonal = (float) Math.sqrt((Math.pow(c.getXAxis() - a.getXAxis(), 2)) +
                (Math.pow(c.getYAxis() - a.getYAxis(), 2)));

        return area = (float) Math.pow((diagonal), 2) / 2;
    }

    /**
     * @return значение имени фигуры
     */
    private String setName() {
        String[] names = {"Zackary", "Zackariah", "Zakir"};
        return name = names[new Random().nextInt(names.length)];
    }
}
