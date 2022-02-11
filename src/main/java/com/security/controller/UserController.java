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



    @GetMapping("/roles")
    public List<Role> findAllRole(){
        return roleService.findAll();
    }






}
