package services;

import models.Student;

public interface IStudentService {
    boolean add(Student student);

    Student[] getAll();

    void removeStudent(Student student);
}
