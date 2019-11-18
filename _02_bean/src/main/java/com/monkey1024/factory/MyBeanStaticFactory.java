package com.monkey1024.factory;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.impl.StudentServiceImpl;

/**
 * Created by thinkpad on 2019/10/9.
 */
public class MyBeanStaticFactory {
    public static StudentService createStudentService(){
        return new StudentServiceImpl();
    }
}
