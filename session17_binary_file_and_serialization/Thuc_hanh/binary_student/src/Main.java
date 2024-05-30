import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Trường", "Hà Nội"));
        students.add(new Student(2, "Tính", "Hà Nội"));
        students.add(new Student(3, "Ngọc", "Hà Nội"));
        students.add(new Student(4, "Hoàng", "Hà Nội"));
        students.add(new Student(5, "Quyền", "Hà Nội"));
        String filePath = "student.txt";
        writeDataToFile(filePath, students);
        List<Student> studentDataFromFile = readDataFromFile(filePath);
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(students);
            os.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
}
