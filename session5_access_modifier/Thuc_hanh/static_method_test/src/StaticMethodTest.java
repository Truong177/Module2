public class StaticMethodTest {
    private int rollno;
    private String name;
    private static String college = "BBDD";

    public StaticMethodTest(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
