package com.snowman.service;

import com.snowman.Exception.BusException;
import com.snowman.entity.UserInfo;

/**
 * Created by Tommy on 2017/12/14.
 */
public interface UserService {
    public UserInfo getUserName(int userId, int age) throws BusException;
}
