package com.example.testing.testing.repositories;

import com.example.testing.testing.entities.MahasiswaEntity;
import com.example.testing.testing.entities.MatkulEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository extends JpaRepository<MahasiswaEntity, Integer> {
}
