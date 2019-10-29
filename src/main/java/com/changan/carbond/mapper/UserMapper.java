package com.changan.carbond.mapper;

import com.github.pagehelper.Page;
import com.changan.carbond.beans.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有用户信息
     * */
    List<User> findAll();

    /**
     * 根据用户ID进行查询 用户信息
     * */
    Page<User> findById(Integer id);

    /**
     * 插入用户信息
     * */
    int insert(User record);

    /**
     * 更新用户信息
     * */
    int checkByIdUpdate(User UserObj);

    /**
     * 删除用户信息
     * */
    int deleteUserInfo(String Name);
}