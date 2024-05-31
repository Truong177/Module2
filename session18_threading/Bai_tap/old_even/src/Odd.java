public class Odd extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Các số chẵn từ 1 - 10 là " + i);
        }try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Lỗi");
        }
    }
}
