package com.monkey1024.service.impl;

import com.monkey1024.service.StudentService;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void study() {
        System.out.println("好好学习天天向上");
    }

    public StudentServiceImpl() {
        System.out.println("创建对象");
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public void destory(){
        System.out.println("销毁方法");
    }
}
