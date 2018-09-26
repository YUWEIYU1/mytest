package cn.itheima.ssm.dao;

import cn.itheima.ssm.po.Users;

public interface UserDao {

    Users findUsers(Users users);
    void zhuce(Users users);

}
