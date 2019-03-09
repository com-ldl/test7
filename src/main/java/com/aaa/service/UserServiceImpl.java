package com.aaa.service;

import com.aaa.dao.UserDao;
import com.aaa.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserServiceImpl
 * description:
 * author:Ldl
 * createTime:2019-03-02 16:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public List<Map> getUser() {
            List<Map> userLists = dao.getUser();
            return userLists;

    }
}
