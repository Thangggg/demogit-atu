package com.security.controller;

import com.security.dto.response.ResponseMessage;
import com.security.model.Role;
import com.security.model.User;
import com.security.service.impl.RoleServiceImpl;
import com.security.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    RoleServiceImpl roleService;

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        Optional<User> users = userService.findById(id);
        if (!users.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userService.deleteById(users.get().getId());
        return new ResponseEntity<>(new ResponseMessage("Delete Success!"), HttpStatus.OK);
    }

    @GetMapping("/roles")
    public List<Role> findAllRole(){
        return roleService.findAll();
    }




}
