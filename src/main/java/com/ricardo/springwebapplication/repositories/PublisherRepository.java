package com.ricardo.springwebapplication.repositories;

import com.ricardo.springwebapplication.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
