public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println("Point3D : " + point3D);
        float[] xyz = point3D.getXYZ();
        System.out.println("X: " + xyz[0] + ", Y: " + xyz[1] + ", Z: " + xyz[2]);
        point3D.setXYZ(5.0f, 6.0f, 7.0f);
        System.out.println("New Point3D : " + point3D);

    }
}