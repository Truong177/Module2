public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(3);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Square area: " + square.getArea());

        circle.resize(50);
        rectangle.resize(30);
        square.resize(40);
        System.out.println("Circle area new: " + circle.getArea());
        System.out.println("Rectangle area new: " + rectangle.getArea());
        System.out.println("Square area new: " + square.getArea());
    }
}