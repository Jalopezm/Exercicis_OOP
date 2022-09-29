package Exercici2;

public class Main {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        polyLine.appendPoint(23, 32);
        polyLine.appendPoint(222, 34);
        polyLine.appendPoint(2323, 32123);
        polyLine.appendPoint(233, 322);
        System.out.println(polyLine);
    }

}
