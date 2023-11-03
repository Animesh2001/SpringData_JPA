package com.sentioza.testrest.Service;

import com.sentioza.testrest.Entities.Book;
import com.sentioza.testrest.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) bookRepository.findAll();
        return list;
    }

    public Book getBookByID(int id) {
        return bookRepository.findById(id);
    }

    //adding the book
    public Book addBook(Book b) {
        return bookRepository.save(b);
    }

    public void deleteBook(int bookId) {
        Book b = bookRepository.findById(bookId);
        bookRepository.delete(b);

    }

    public void updateBook(Book book, int bookId) {
        bookRepository.save(book);
    }


}
