package com.changan.carbond.service.impl;

public class CreateObject<T> {
    /**
     * 1表示正常，0表示异常
     */
    private String code;
    /**
     * 面向用户的消息
     */
    private String message;
    /**
     * 面向开发者的详细信息
     */
    private String detail;
    /**
     * 返回给前端的数据
     */
    private T datas;

    /**
     * CreateObject 构造方法
     * */
    public CreateObject(String code, String message, String detail, T datas) {
        this.setCode(code);
        this.setMessage(message);
        this.setDetail(detail);
        this.setDatas(datas);
    }

    /**
     * setCode 设置构造函数的code
     * */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * setMessage 设置构造函数的message
     * */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * setDetail 设置构造函数的detail
     * */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * setDatas 设置构造函数的datas
     * */
    public void setDatas(T datas) {
        this.datas = datas;
    }

    /**
     * 由于我们这里返回的是一个构造函数
     * spring boot框架需要针对构造函数改变成JSON对象 返回给客服端
     * 所以这里需要定义几个get方法给spring boot调用并且返回当前构造函数的值
     * */
    public String getCode() {
        return code;
    }

    /**
     * getDetail 获取当前构造函数的 detail
     * */
    public String getDetail() {
        return detail;
    }

    /**
     * getMessage 获取当前构造函数的 message
     * */
    public String getMessage() {
        return message;
    }

    /**
     * getDatas 获取当前构造函数的 datas
     * */
    public T getDatas() {
        return datas;
    }

//    public static CreateObject success(String message, String detail) {
//        return new CreateObject("1", message, detail, null);
//    }
//
//    public static CreateObject fail(String message, String detail) {
//        return new CreateObject("0", message, detail, null);
//    }
}
