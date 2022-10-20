package figur;

import java.util.Random;
public class Triangle extends BaseFigure {

    private String name;
    private float area;
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
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
        Point[] allPoints = new Point[]{a, b, c};
        float[][] coordinates = new float[allPoints.length][];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = new float[] {allPoints[i].getXAxis(), allPoints[i].getYAxis()};
        }
        return coordinates;
    }

    /**
     * @return значение площади треугольника
     */
    private float calculateArea() {
        /*
         * S = √ p*(p-ab)*(p-bc)*(p-ac)
         * P = (a+b+c)/2
         */
        float ab = (float) Math.sqrt(Math.pow(a.getXAxis() - b.getXAxis(), 2) + Math.pow(a.getYAxis() - b.getYAxis(), 2));
        float bc = (float) Math.sqrt(Math.pow(b.getXAxis() - c.getXAxis(), 2) + Math.pow(b.getYAxis() - c.getYAxis(), 2));
        float ac = (float) Math.sqrt(Math.pow(a.getXAxis() - c.getXAxis(), 2) + Math.pow(a.getYAxis() - c.getYAxis(), 2));
        float semiPerimeter = (ab + bc + ac) / 2;

        return area = (float) Math.sqrt((semiPerimeter * (semiPerimeter - ab)) * (semiPerimeter - bc) * (semiPerimeter-ac));
    }

    private String setName() {
        String[] names = {"Garatun", "Gordon", "Govanni", "Guendi", "Haggai"};
        return name = names[new Random().nextInt(names.length)];
    }
}
