package com.example.myfirstspringapp.repository;

import com.example.myfirstspringapp.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
}
