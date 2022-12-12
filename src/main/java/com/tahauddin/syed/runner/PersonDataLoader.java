package com.tahauddin.syed.runner;

import com.tahauddin.syed.domain.repo.PersonsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class PersonDataLoader implements CommandLineRunner {

    private final PersonsRepository personsRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Person Repository Count is :: {}", personsRepository.count());
    }
}
