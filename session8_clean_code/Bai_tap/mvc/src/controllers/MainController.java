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
                case 2:
                    break;
                case 3:
                    int code = StudentView.inPutCode();
                    student = StudentService.findByCode(code);
                    if (student == null) {
                        studentView.displayMessegeNotFound();
                        studentView.viewMessage(false);
                    } else {
                        boolean isConfirm = studentView.confirmDelete(student);
                        if (isConfirm) {
                            studentService.removeStudent(student);
                            studentView.viewMessage(true);
                        }
                    }
                    break;
                case 4:
                    Student[] students = studentService.getAll();
                    StudentView.displayAllStudent(students);
                    break;
                case 0:
                    return;
            }
        }
    }
}
