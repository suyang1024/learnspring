package com.monkey1024.dao.impl;

import com.monkey1024.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by thinkpad on 2019/10/10.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加学生数据");
    }
}
