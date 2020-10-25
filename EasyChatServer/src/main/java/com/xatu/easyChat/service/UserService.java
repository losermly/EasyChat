package com.xatu.easyChat.service;

import com.xatu.easyChat.entity.User;

public interface UserService {
    public User getUserById(String uid);

    User queryUserIsExist(String username);

    int insert(User user);
}