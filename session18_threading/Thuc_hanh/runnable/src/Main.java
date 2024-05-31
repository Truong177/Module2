public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        MyRunnable myRunnable1 = new MyRunnable("Thread-1-HR-Database");
        myRunnable1.start();
        MyRunnable myRunnable2 = new MyRunnable("Thread-2-Send-Email");
        myRunnable2.start();
        System.out.println("Main thread stopped");
    }
}