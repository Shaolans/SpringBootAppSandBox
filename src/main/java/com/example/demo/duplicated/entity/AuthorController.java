package com.example.demo.duplicated.entity;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final EntityManager entityManager;

    @GetMapping("/test1")
    public ResponseEntity test1() {
        return ResponseEntity.ok(authorRepository.findAll().size());
    }

    @GetMapping("/test2")
    public ResponseEntity test2() {
        return ResponseEntity.ok(authorRepository.findLeftJoinFetch().size());
    }

    @GetMapping("/test3")
    public ResponseEntity test3() {
        return ResponseEntity.ok(authorRepository.findLeftJoinFetchWithEntityGraph().size());
    }

    @GetMapping("/test4")
    public ResponseEntity test4() {
        return ResponseEntity.ok(getSession().createQuery("SELECT a FROM Author a LEFT JOIN FETCH a.books").getResultList().size());
    }

    @GetMapping("/test5")
    public ResponseEntity test5() {
        return ResponseEntity.ok(authorRepository.findAllBy().size());
    }

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

}
