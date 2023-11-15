package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, Integer> {
    List<MyEntityView> findAllById(Integer id);
}
