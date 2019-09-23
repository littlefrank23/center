package com.mycom.center.repository;

import com.mycom.center.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: UserRepository
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 15:34
 **/
public interface UserRepository extends JpaRepository<User, Integer> {
}
