public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double  getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String disPlay() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
