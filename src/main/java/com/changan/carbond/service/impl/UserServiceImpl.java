package com.changan.carbond.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.changan.carbond.beans.User;
import com.changan.carbond.common.GeneralResponse;
import com.changan.carbond.mapper.UserMapper;
import com.changan.carbond.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required=false)
    private UserMapper userMapper;

    /**
     * 查询所有用户信息
     * */
    @Override
    public CreateObject findAll() {
        List<User> users = userMapper.findAll();
        /**
         * 根据获取出来的对象集合->循环取出每个用户的独立信息:name
         * */
        List<String> userNames=new ArrayList<String>();
        for(User li: users){
            userNames.add(li.getName());
        }
        System.out.println(userNames);

        //        CreateObject a=new CreateObject("0", "查询成功", "查询成功", users);
        //int i = 1 / 0;
        /*int[] ints = {1,2,3,4};
        System.out.println(ints[5]);*/
        return new CreateObject("0", "查询成功", "查询成功", users);
    }

    /**
     * 根据用户ID进行查询 用户信息
     * */
    @Override
    public GeneralResponse findById(Integer id) {
        Page<User> currentUser = userMapper.findById(id);
        return new GeneralResponse("0", "查询成功", "查询成功", currentUser);
    }

    /**
     * 插入用户信息
     * */
    @Override
    public GeneralResponse insert(User user) {
        int result = userMapper.insert(user);
        return result == 1?new GeneralResponse("0", "新增成功", "新增成功", result):new GeneralResponse("1", "新增失败", "新增失败", result);
    }

    /**
     * 更新用户信息
     * */
    @Override
    public GeneralResponse checkByIdUpdate(User user){
        int result = userMapper.checkByIdUpdate(user);
        return result == 1? new GeneralResponse("0", "修改成功", "修改成功", result):new GeneralResponse("0", "修改失败", "修改失败", result);
    }

    /**
     * 删除用户信息
     * */
    @Override
    public GeneralResponse deleteUserInfo(String name){
        int result = userMapper.deleteUserInfo(name);
        return result==1?new GeneralResponse("0", "删除成功", "删除成功", result):new GeneralResponse("0", "删除失败", "删除失败", result);
    }
}
