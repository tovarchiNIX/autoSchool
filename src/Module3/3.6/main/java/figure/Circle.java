package figure;

import java.util.Random;
public class Circle extends BaseFigure {

    private String name;
    private float area;
    private final Point a;
    private final Point b;

    public Circle() {
        a = new Point();
        b = new Point();
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
        Point[] allPoints = new Point[]{a, b};
        float[][] coordinates = new float[allPoints.length][];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = new float[] {allPoints[i].getXAxis(), allPoints[i].getYAxis()};
        }
        return coordinates;
    }

    /**
     * @return значение площади круга
     */
    private float calculateArea() {
        //Радиус круга считается по формуле R = √ (x2 - x1)^2 + (y2 - y1)^2
        float radius = (float) Math.sqrt(Math.pow(a.getXAxis() - b.getXAxis(), 2) +
                Math.pow(a.getYAxis() - b.getYAxis(), 2));

        // Площадь круга считается по формуле PI* R2
        return area = (float) (Math.PI * Math.pow(radius, 2));
    }

    /**
     * @return значение имени фигуры
     */
    private String setName() {
        String[] names = {"Gwen", "Gwendolen", "Rhodri", "Chakra", "Mandala", "Rondel"};
        return name = names[new Random().nextInt(names.length)];
    }
}
