package com.tahauddin.syed.runner;

import com.tahauddin.syed.domain.entity.Author;
import com.tahauddin.syed.domain.repo.AuthorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class AuthorDataLoader implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        authorRepository.save(Author.builder().authorName("John Thompson").country("USA").build());
        log.info("Author Saved..");
        authorRepository.findAll().forEach(l -> log.info("Author is ::  {}", l));
    }
}
