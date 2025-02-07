package com.bankapp.service;

import com.bankapp.repo.UserEntity;
import com.bankapp.repo.UserEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserEntityServiceImpl implements UserEntityService {
    private UserEntityRepo userEntityRepo;
    @Autowired
    public UserEntityServiceImpl(UserEntityRepo userEntityRepo) {
        this.userEntityRepo = userEntityRepo;
    }

    @Override
    public UserEntity findByUsername(String username) {
        return userEntityRepo.findByUsername(username);
    }

    @Override
    public void addUserEntity(UserEntity userEntity) {
        userEntityRepo.save(userEntity);
    }
}
