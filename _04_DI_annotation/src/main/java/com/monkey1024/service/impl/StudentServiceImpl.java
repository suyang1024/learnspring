package com.monkey1024.service.impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by thinkpad on 2019/10/7.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    /*@Autowired
    @Qualifier("userDao")
    private UserDao userDao;*/

    @Resource
    private UserDao userDao;



    @Override
    public void addUser() {
        userDao.addUser();
    }

}
