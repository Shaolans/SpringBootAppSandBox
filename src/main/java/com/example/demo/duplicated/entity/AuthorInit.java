package com.example.demo.duplicated.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorInit {
    private final AuthorRepository authorRepository;

    @PostConstruct
    private void create() {
        var author = new Author();
        var book1 = new Book();
        book1.setTitle("Harry potter");
        book1.setAuthor(author);
        var book2 = new Book();
        book2.setTitle("1984");
        book2.setAuthor(author);
        var book3 = new Book();
        book3.setTitle("MHW");
        book3.setAuthor(author);
        author.setBooks(List.of(book1, book2, book3 ));
        authorRepository.save(author);
        author = new Author();
        book1 = new Book();
        book1.setTitle("fondation");
        book1.setAuthor(author);
        book2 = new Book();
        book2.setTitle("isaac");
        book2.setAuthor(author);
        author.setBooks(List.of(book1, book2));
        authorRepository.save(author);
        author = new Author();
        authorRepository.save(author);
    }
}
