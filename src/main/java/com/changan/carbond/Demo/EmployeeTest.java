package com.changan.carbond.Demo;

import java.io.*;
import java.util.List;

import com.changan.carbond.Demo.Implements.quoteClass;
import com.changan.carbond.service.impl.CreateObject;

import com.changan.carbond.Demo.Implements.Pig;
import com.changan.carbond.Demo.Implements.Run;
public class EmployeeTest{

    public static void main(String[] args){
        Run t1=new Pig();
//        CreateObject lists= t1.Canrun();
        CreateObject cite= new CreateObject("0", "查询成功", "查询成功", "我是一个返回");
//        cite.getCode();
        Object lists= new CreateObject("0", "查询成功", "查询成功", "我是一个返回");
//        lists.getCode();
        Object obj =  new Object();
//        obj.getCode();
        CreateObject x = (CreateObject)lists;
        System.out.println(lists);
        System.out.println(x);
//        t1.Cansay();

//        /* 使用构造器创建两个对象 */
//        Employee empOne = new Employee("RUNOOB1");
//        Employee empTwo = new Employee("RUNOOB2");
//
//        // 调用这两个对象的成员方法
//        empOne.empAge(26);
//        empOne.empDesignation("高级程序员");
//        empOne.empSalary(1000);
//        empOne.printEmployee();
//
//        empTwo.empAge(21);
//        empTwo.empDesignation("菜鸟程序员");
//        empTwo.empSalary(500);
//        empTwo.printEmployee();
    }
}