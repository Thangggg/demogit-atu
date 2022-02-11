package com.security.repository;

import com.security.model.Role;
import com.security.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepo extends JpaRepository <Role, Long>{
    Optional<Role> findByName(RoleName name);
}
