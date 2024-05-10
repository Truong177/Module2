public class FindMinArray {
    public static void main(String[] args) {
        int[] arr = {36, 12, 7, 8, 10, 6, 9};
        int index = minValue(arr);
        System.out.println("Số nhỏ nhất trong mảng là : " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
