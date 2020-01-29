package com.ricardo.springwebapplication.repositories;

import com.ricardo.springwebapplication.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
