package com.library.repository;

import com.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Book} class.
 *
 * @author Eugene Yefimov
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
