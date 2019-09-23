package com.mycom.center.service;

import com.mycom.center.entry.User;

import java.util.List;

/**
 * @ClassName: IUserService
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 15:35
 **/
public interface IUserService {
    public User getUserById(Integer id);

    public User getUserByNameAndPwd(String userName, String pwd);
}
