package com.monkey1024.service.impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.service.StudentService;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class StudentServiceImpl implements StudentService {

    private UserDao userDao;

   public StudentServiceImpl(UserDao userDao) {
       this.userDao = userDao;
   }

    @Override
    public void addUser() {
        userDao.addUser();
    }

}
