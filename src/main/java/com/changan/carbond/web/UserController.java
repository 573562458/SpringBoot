package com.changan.carbond.web;

import com.changan.carbond.beans.User;
import com.changan.carbond.common.GeneralResponse;
import com.changan.carbond.service.impl.CreateObject;
import com.changan.carbond.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     * */
    @GetMapping("/findAll")
    public CreateObject findAll(String id){
        System.out.println(id);
        return userService.findAll();
    }

    /**
     * 根据用户ID进行查询 用户信息
     * */
    @PostMapping("/findById")
    public GeneralResponse findById(Integer id){
        return userService.findById(id);
    }

    /**
     * 更新用户信息
     * */
    @PostMapping("/checkByIdUpdate")
    public GeneralResponse checkByIdUpdate(User user){
        return userService.checkByIdUpdate(user);
    }

    /**
     * JSON对象的参数 插入用户信息
     * */
    @PostMapping("/insert")
    public GeneralResponse insert(@RequestBody User user){
        return userService.insert(user);
    }

    /**
     * from表单的参数 插入用户信息
     * */
    @PostMapping("/insertFrom")
    public GeneralResponse insertFrom(User user){
        return userService.insert(user);
    }

    /**
     * 删除用户信息
     * */
    @PostMapping("/deleteUserInfo")
    public GeneralResponse deleteUserInfo(String name){
        return userService.deleteUserInfo(name);
    }
}

