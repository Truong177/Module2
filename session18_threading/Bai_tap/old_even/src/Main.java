public class Main {
    public static void main(String[] args) {
        Odd oddThread = new Odd();
        Even evenThread = new Even();
        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}