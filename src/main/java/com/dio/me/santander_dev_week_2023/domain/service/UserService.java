package com.dio.me.santander_dev_week_2023.domain.service;

import com.dio.me.santander_dev_week_2023.domain.model.User;


public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
