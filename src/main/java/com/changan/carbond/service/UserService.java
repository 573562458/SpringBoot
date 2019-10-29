package com.changan.carbond.service;

import com.changan.carbond.beans.User;
import com.changan.carbond.common.GeneralResponse;
import com.changan.carbond.service.impl.CreateObject;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    /**
     * 查询所有用户信息
     * */
    CreateObject findAll();

    /**
     * 根据用户ID进行查询 用户信息
     * */
    GeneralResponse findById(Integer id);

    /**
     * 更新用户信息
     * */
    GeneralResponse checkByIdUpdate(User user);

    /**
     * 插入用户信息
     * */
    GeneralResponse insert(User user);

    /**
     * 删除用户信息
     * */
    GeneralResponse deleteUserInfo(String name);
}
