package com.library.service;

import com.library.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for {@link Book} class.
 *
 * @author Eugene Yefimov
 */
public interface BookService {

    Optional<Book> getById(Long id);

    void save(Book book);

    void delete(Long id);

    List<Book> getAll();
}
