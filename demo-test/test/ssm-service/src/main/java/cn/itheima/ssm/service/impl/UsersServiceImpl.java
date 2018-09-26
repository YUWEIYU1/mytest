package cn.itheima.ssm.service.impl;

import cn.itheima.ssm.dao.UserDao;
import cn.itheima.ssm.po.Users;
import cn.itheima.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UserDao userDao;
    @Override
    public Users findUsers(Users users) {
        return userDao.findUsers(users);
    }

    @Override
    public void zhuce(Users users) {
        userDao.zhuce(users);
    }
}
