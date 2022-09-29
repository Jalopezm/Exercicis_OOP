package Exercici2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points = new ArrayList();

    public PolyLine() {
    }

    public PolyLine(List points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        Point point = new Point(x, y);
        this.points.add(point);
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public double getLength() {
        return 0;
    }

    @Override
    public String toString() {
        String listPoints = "{(";
        for (Point point : this.points) {

            if (point.getX() == 1) {
                listPoints += "x,";
            } else {
                listPoints += "x " + point.getX() + ",";
            }

            if (point.getY() == 1) {
                listPoints += "y)(";
            } else {
                listPoints += "y " + point.getY() + ")(";
            }
        }
        listPoints = listPoints.substring(0, listPoints.length() - 1);
        listPoints += "}";
        return listPoints;
    }
}
