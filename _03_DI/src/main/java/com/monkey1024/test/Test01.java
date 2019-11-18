package com.monkey1024.test;

import com.monkey1024.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thinkpad on 2019/10/10.
 */
public class Test01 {

    @Test
    public void testDI() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService)context.getBean("studentService");
        studentService.addUser();
    }
}
