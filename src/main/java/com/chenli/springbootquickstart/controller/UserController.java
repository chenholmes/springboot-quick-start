package com.chenli.springbootquickstart.controller;

import com.chenli.springbootquickstart.domain.entity.user.User;
import com.chenli.springbootquickstart.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Date: 2019-10-11 14:41.</p>
 *
 * @author chenli
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getOne(@PathVariable Integer id) {
        return this.userService.getOne(id);
    }

    public String hello() {
        return "dev1";
    }


}
