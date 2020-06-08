package com.boot.mdp.mapper;

import com.boot.mdp.entities.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper extends BaseMapper<User> {

    Map<String, Object> queryUser(@Param("userId") String userId);
}
