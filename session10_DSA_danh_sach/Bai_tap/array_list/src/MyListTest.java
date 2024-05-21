public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0, "A");
        list.add(1, "B");
        list.add(2, "C");
        list.add(1, "D");
        System.out.println("Danh sách sau khi thêm các phần tử: ");
        printList(list);
        String removedElement = list.remove(2);
        System.out.println("Phần tử bị xóa: " + removedElement);
        System.out.println("Danh sách sau khi xóa phần tử tại vị trí 2: ");
        printList(list);
        System.out.println("Kích thước danh sách: " + list.size());
        boolean containsB = list.contains("B");
        System.out.println("Danh sách có chứa phần tử 'B': " + containsB);
        list.clear();
        System.out.println("Danh sách sau khi xóa tất cả các phần tử: ");
        printList(list);
    }
    public static void printList(MyList<?> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
