package com.codingdojo.bookClub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.bookClub.models.Book;
import com.codingdojo.bookClub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	//return all books
	public List<Book>allBooks(){
		return bookRepository.findAll();
	}
	
	//create new book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	//update a book
	public Book update(Book b) {
		return bookRepository.save(b);
	}
	
    //retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    //deletes a book
	public void delete(Long id) {
		bookRepository.deleteById(id);
	}
}
