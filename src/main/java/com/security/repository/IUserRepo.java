package com.security.repository;

import com.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String name); //Tim xem user co trong DB k?

    Boolean existsByUsername(String username); //check username da ton tai trong DB chua?

    Boolean existsByEmail(String email); //check xem email ton tai trong DB chua?
}
