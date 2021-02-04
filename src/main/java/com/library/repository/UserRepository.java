package com.library.repository;

import com.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link User} class.
 *
 * @author Eugene Yefimov
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
