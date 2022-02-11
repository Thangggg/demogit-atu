package com.security.service;

import com.security.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String name); //Tim xem user co trong DB k?

    Boolean existsByUsername(String username); //check username da ton tai trong DB chua?

    Boolean existsByEmail(String email); //check xem email ton tai trong DB chua?

    User save(User user);

    void deleteById(Long id);

    Optional<User> findById(Long id);
}
