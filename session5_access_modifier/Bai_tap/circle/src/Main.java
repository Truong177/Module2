public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5,"blue");
        System.out.println("Circle 1: radius = " + c1.getRadius() + ", color = " + c1.getColor() + ", area = " + c1.getArea());
        System.out.println("Circle 2: radius = " + c2.getRadius() + ", color = " + c2.getColor() + ", area = " + c2.getArea());
    }
}