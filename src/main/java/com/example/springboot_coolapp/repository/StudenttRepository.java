package com.example.springboot_coolapp.repository;

import com.example.springboot_coolapp.model.Studentt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudenttRepository extends JpaRepository<Studentt, Long> {
}
