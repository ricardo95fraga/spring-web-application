package com.ricardo.springwebapplication.repositories;

import com.ricardo.springwebapplication.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
