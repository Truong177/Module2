import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu: "+ Arrays.toString(array));
        System.out.println("Mảng sau khi đảo ngược: ");
        reverseArray(array);

        String str = "hello my friend";
        System.out.println("\nChuỗi ban đầu: " + str);

        String reversedStr = reverseString(str);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedStr);
    }

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int num : array) {
            stack.push(num);
        }
        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static String reverseString(String str){
        Stack<String> stack = new Stack<>();
        String [] words = str.split(" ");
        for (String word : words){
            stack.push(word);
        }
        List<String> reversedlist = new ArrayList<>();
        while (!stack.isEmpty()){
            reversedlist.add(stack.pop());
        }
        return String.join(" ",reversedlist);
    }
}
