import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh ");
        String name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của sinh viên trong danh sách " + name + " is : " + i);
                isExit =true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Không tìm thấy " +name+ " trong danh sách");
        }
    }
}
