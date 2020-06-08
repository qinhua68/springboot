package com.boot.mdp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.boot.mdp.entities.User;

import java.util.List;
import java.util.Map;

public interface IUserService {

    List<User> selectAllOne();

    List<User> selectAllTwo();

    IPage<User> page();

    Map<String, Object> queryUser(String userId);
}
