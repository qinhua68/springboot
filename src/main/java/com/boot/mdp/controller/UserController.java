package com.boot.mdp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.boot.mdp.entities.User;
import com.boot.mdp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/findMasterUser", method = RequestMethod.POST)
    public List<User> findMasterUser() {
        return userService.selectAllOne();
    }

    @RequestMapping(value = "/findClusterUser", method = RequestMethod.POST)
    public List<User> findClusterUser() {
        return userService.selectAllTwo();
    }

    @RequestMapping(value = "/findPage", method = RequestMethod.POST)
    public IPage<User> findPage() {
        return userService.page();
    }

    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    public Map<String, Object> findUser() {
        return userService.queryUser("1");
    }
}
