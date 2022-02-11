package com.security.service.impl;

import com.security.model.Role;
import com.security.model.RoleName;
import com.security.repository.IRoleRepo;
import com.security.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepo roleRepo;

    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepo.findByName(name);
    }

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }
}
