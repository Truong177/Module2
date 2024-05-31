public class Even extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Các số lẻ từ 1- 10 là " + i);
        }try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            System.out.println("Lỗi");
        }
    }
}
