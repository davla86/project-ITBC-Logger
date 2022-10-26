package com.example.main_project.repository;


import com.example.main_project.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientJpaRepository extends JpaRepository<Client, Integer> {
    Optional<Client> findById(int id);

    List<Client> findByNameStartsWith(String name);
}

