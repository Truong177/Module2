public class Main {
    public static void main(String[] args) {
        StaticMethodTest.change();
        StaticMethodTest s1 = new StaticMethodTest(111,"Truong");
        StaticMethodTest s2 = new StaticMethodTest(222,"Tinh");
        StaticMethodTest s3 = new StaticMethodTest(333,"Ngoc");
        s1.display();
        s2.display();
        s3.display();
    }
}