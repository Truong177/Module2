package controllers;

import models.Student;
import services.IStudentService;
import services.impl.StudentService;
import views.StudentView;

public class MainController {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        IStudentService studentService = new StudentService();
        Student student;
        int choice;
        boolean result;
        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    result = studentService.add(student);
                    studentView.viewMessage(result);
                    break;
                }
            }
        }
    }
}
