package com.example.springboot_coolapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args ->
        {
            Student kevin = new Student(
                    "Kevin",
                    "kevin.kyei@gmail.com",
                    LocalDate.of(2000, AUGUST, 23)
            );

            Student mirriam = new Student(
                    "Mirriam",
                    "mirriam.kyei@gmail.com",
                    LocalDate.of(2005, SEPTEMBER, 9)
            );

            Student milka = new Student(
                    "Milka",
                    "milka.mutiso@yahoo.com",
                    LocalDate.of(1999, DECEMBER, 27)
            );

            repository.saveAll(
                    List.of(kevin, mirriam, milka)
            );
        };
    }
}
