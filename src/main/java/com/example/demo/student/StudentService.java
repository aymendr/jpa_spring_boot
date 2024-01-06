package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){
        return studentRepository.findAll();


        /*
        return List.of(new Student(
                1L,
                "Mariem",
                23,
                LocalDate.of(2022,12,22),
                "mariemdrira@gmail.com"
        ));*/
    }
}
