package com.example.demo.repository;

import com.example.demo.model.Perro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerroRepository extends JpaRepository<Perro, Long> {

}
