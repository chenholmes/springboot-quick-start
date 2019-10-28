package com.chenli.springbootquickstart.service.user;

import com.chenli.springbootquickstart.dao.user.UserMapper;
import com.chenli.springbootquickstart.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Date: 2019-10-11 14:36.</p>
 *
 * @author chenli
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getOne(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
