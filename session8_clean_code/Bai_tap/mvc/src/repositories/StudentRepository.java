package repositories;

import models.Student;

import java.util.Arrays;

public class StudentRepository {
    private static Student[] students = new Student[100];
    private static int count = 0;

    static {
        students[0] = new Student(1, "Truong", "Ha noi ", "C0324H1");
        count = 1;
    }

    public static Student findByCode(int code) {
        for (Student student : students) {
            if (student == null) {
                return null;
            }
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    public void add(Student student) {
        students[count] = student;
        count++;
    }

    public Student[] getAll() {
        Student[] result = Arrays.copyOf(students, count);
        return result;
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCode() == student.getCode()) {
                for (int j = 0; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
            }
        }
    }
}

