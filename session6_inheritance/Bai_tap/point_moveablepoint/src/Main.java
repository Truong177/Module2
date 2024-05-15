public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.5f, 4.2f);
        System.out.println("Point : " + point);
        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.1f, 0.2f);
        System.out.println("MovablePoint: " + movablePoint);
        movablePoint.Getmove();
        System.out.println("New MovablePoint: " + movablePoint);
    }
}