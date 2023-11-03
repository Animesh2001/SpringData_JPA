package com.sentioza.testrest.dao;

import com.sentioza.testrest.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book findById(int id);
}
