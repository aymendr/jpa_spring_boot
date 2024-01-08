package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariem = new Student(
                    "Mariem",
                    LocalDate.of(2022, 12, 22),
                    "mariem@gmail.com");

            Student Mohamed = new Student(
                    "Mohamed",
                    LocalDate.of(2000, 12, 22),
                    "mohamed@gmail.com");

            repository.saveAll(List.of(mariem,Mohamed));
        };
    }
}
