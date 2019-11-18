package com.monkey1024.test;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class Test01 {
    @Test
    public void oldType() {
        StudentService studentService = new StudentServiceImpl();
        studentService.study();
    }

    @Test
    public void newType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.study();
    }

    @Test
    public void newType2() {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("D:\\Users\\thinkpad\\IdeaProjects\\learnspring\\_01_firstspring\\src\\main\\resources\\applicationContext.xml"));
    }
}
