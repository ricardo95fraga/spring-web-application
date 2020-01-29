package com.ricardo.springwebapplication.repositories;

import com.ricardo.springwebapplication.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
