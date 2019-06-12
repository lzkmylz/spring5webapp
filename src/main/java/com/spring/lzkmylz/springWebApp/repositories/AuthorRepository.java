package com.spring.lzkmylz.springWebApp.repositories;

import com.spring.lzkmylz.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
