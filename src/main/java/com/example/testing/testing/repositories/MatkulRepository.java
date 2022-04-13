package com.example.testing.testing.repositories;

import com.example.testing.testing.entities.MatkulEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatkulRepository extends JpaRepository<MatkulEntity, Integer> {
}
