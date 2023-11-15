package com.example.demo.duplicated.entity;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("SELECT a FROM Author a LEFT JOIN FETCH a.books")
    List<Author> findLeftJoinFetch();

    @EntityGraph(attributePaths = "books")
    @Query("SELECT a FROM Author a LEFT JOIN FETCH a.books")
    List<Author> findLeftJoinFetchWithEntityGraph();

    @EntityGraph(attributePaths = "books")
    List<Author> findAllBy();
}
