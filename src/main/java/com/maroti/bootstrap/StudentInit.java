package com.maroti.bootstrap;

import com.maroti.model.Student;
import com.maroti.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class StudentInit implements CommandLineRunner {

    private StudentRepository studentRepository;

    public StudentInit(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<String> list=List.of("Maroti","Jyoti","Arnav","Jagruti");

        list.forEach(name->{
            Student std=Student.builder().name(name).build();
            studentRepository.save(std);
            System.out.println("Name : " +name);

        });


    }
}
