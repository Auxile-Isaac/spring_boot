package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Auxile = new Student(
                    "Auxile",
                    "auxile@gmail.com",
                    LocalDate.of(1994, Month.JULY, 11)
            );

            Student Isaac = new Student(
                    "Isaac",
                    "isaac@gmail.com",
                    LocalDate.of(1997, Month.JULY, 11)
            );

            repository.saveAll(
                    List.of(Auxile, Isaac)
            );
        };
    }
}
