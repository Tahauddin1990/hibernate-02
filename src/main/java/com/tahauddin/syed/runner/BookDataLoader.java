package com.tahauddin.syed.runner;

import com.tahauddin.syed.domain.entity.Book;
import com.tahauddin.syed.domain.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
@Profile("mysql")
public class BookDataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        if(bookRepository.count() == 0){
            loadBookData();
        }
        log.info("Fetching all Books");
        bookRepository.findAll().forEach(l -> log.info("Book is :: {}", l));
    }

    private void loadBookData() {
        bookRepository.saveAll(List.of(
                Book.builder().name("Spring Core").isbn("1234").publisher("Sumanth").build(),
                Book.builder().name("Spring JDBC").isbn("1235").publisher("Sumanth").build(),
                Book.builder().name("Spring Web").isbn("1236").publisher("Sumanth").build(),
                Book.builder().name("Spring Security").isbn("1237").publisher("Sumanth").build(),
                Book.builder().name("Spring Boot Core").isbn("1238").publisher("Sumanth").build(),
                Book.builder().name("Spring Boot Data JPA").isbn("1239").publisher("Sumanth").build(),
                Book.builder().name("Spring Boot Web").isbn("1240").publisher("Sumanth").build(),
                Book.builder().name("Spring Boot Rest").isbn("1241").publisher("Sumanth").build()
        ));
        log.info("Books Saved :: {}", bookRepository.count());
    }
}
