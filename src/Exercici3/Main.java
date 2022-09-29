package Exercici3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("No resizabled circle  " + circle);

        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println("Resizable circle  " + resizableCircle);

        resizableCircle.resize(200);
        System.out.println("Resizabled circle  " + resizableCircle);


    }
}
