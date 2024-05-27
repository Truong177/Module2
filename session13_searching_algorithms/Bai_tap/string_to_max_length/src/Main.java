import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi ký tự : ");
        String s = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > list.getLast()) {
                    list.add(s.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
