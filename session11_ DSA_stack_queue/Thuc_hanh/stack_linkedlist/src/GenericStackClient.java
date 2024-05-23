public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }

    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("For");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        stack.push("Zero");
        System.out.println("1.1 Kích thước của ngăn xếp sau thao tác đẩy: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("\n1.2" + " Kích thước của ngăn xếp sau các thao tác pop : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        System.out.println("2.1 Kích thước của ngăn xếp sau thao tác đẩy: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("\n2.2" + " Kích thước của ngăn xếp sau các thao tác pop : " + stack.size());
    }
}