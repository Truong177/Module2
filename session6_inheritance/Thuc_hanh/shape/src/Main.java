public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(2, 5);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle("Orange", true, 3, 6);
        System.out.println(rectangle2);

        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(5);
        System.out.println(square1);
        Square square2 = new Square(5 ,"Purple" , true);
        System.out.println(square2);

        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(4);
        System.out.println(circle1);
        Circle circle2 = new Circle(5 , "Black" , true);
        System.out.println(circle2);
        System.out.println(circle2.getArea());
    }
}
