public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int x = 9;
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            System.out.println("Phần tử " + x + " xuất hiện trong mảng tại vị trí " + (index_del + 1));
        } else {
            System.out.println("Phần tử " + x + " không xuất hiện trong mảng.");
        }
    }
}
