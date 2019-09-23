package com.mycom.center.service.impl;

import com.mycom.center.entry.User;
import com.mycom.center.repository.UserRepository;
import com.mycom.center.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 15:36
 **/
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Integer id){
        User user = userRepository.getOne(id);
        return user;
    }

    @Override
    public User getUserByNameAndPwd(String userName, String pwd){
        List<User> userList = null;
        userList = userRepository.findByUserNameAndPassword(userName,pwd);
        if (userList != null && !userList.isEmpty()){
            return userList.get(0);
        }
        return null;
    }
}
