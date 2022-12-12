package com.tahauddin.syed.domain.repo;

import com.tahauddin.syed.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
