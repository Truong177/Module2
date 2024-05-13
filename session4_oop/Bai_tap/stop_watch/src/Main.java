import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn cho 100,000 số. " + elapsedTime + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}