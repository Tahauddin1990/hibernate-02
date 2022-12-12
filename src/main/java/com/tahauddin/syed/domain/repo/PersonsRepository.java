package com.tahauddin.syed.domain.repo;

import com.tahauddin.syed.domain.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepository extends JpaRepository<Persons, Long> {

}
