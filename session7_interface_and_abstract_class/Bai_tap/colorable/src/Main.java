public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
        if (square instanceof Colorable) {
            ((Colorable) square).howToColor();
        }
    }
}