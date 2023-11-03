package com.sentioza.testrest.Controller;

import com.sentioza.testrest.Entities.Book;
import com.sentioza.testrest.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/get/data", method = RequestMethod.GET)
    public String getData() {
        return "Hello World";
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }


    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return bookService.getBookByID(id);
    }


    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        Book b = this.bookService.addBook(book);
        return b;
    }


    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        this.bookService.deleteBook(bookId);
    }


    //update book handler
    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book, @RequestParam("bookId") int bookId) {
        this.bookService.updateBook(book, bookId);
        return book;
    }

}
