package cn.itheima.ssm.service;

import cn.itheima.ssm.po.Users;

public interface UsersService {
    Users findUsers(Users users);
    void zhuce(Users users);
}
