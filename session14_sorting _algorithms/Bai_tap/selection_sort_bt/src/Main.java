public class Main {
    public static void main(String[] args) {
        int[] list = {5, 2, 9, 1, 5, 6};
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
            display(list,i);  
        }
    }

    private static void display(int[] list, int i) {
        System.out.print("Step " + i + ": ");
        for (int j : list){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}