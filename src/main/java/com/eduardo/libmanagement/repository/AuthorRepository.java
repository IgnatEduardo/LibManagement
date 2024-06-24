package com.eduardo.libmanagement.repository;

import com.eduardo.libmanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
