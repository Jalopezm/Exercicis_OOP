package Exercici2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points = new ArrayList();

    public PolyLine(){

    }
    public PolyLine(List points){
        this.points = points;
    }
    public void appendPoint(int x, int y){
    int valueX = x;
    int valueY = y;
    }
    public void appendPoint(Point point){
        point = new Point();
    }
    public double getLength(){
    return 0;
    }
    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }
}