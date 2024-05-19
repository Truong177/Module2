package services.impl;

import models.Student;
import repositories.StudentRepository;
import services.IStudentService;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();


    @Override
    public boolean add(Student student) {
        if (student.getName().equals("")) {
            return false;
        }
        if (student.getCode() < 0 || student.getCode() > 1000000){
            return false;
        }
        studentRepository.add(student);
        return true;
    }
}

