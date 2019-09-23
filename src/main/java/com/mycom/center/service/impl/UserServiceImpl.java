package com.mycom.center.service.impl;

import com.mycom.center.entry.User;
import com.mycom.center.repository.UserRepository;
import com.mycom.center.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}