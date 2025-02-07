package com.bankapp.config;

import com.bankapp.repo.UserEntity;
import com.bankapp.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyDetailService implements UserDetailsService {

    @Autowired
    private UserEntityService userEntityService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity=userEntityService.findByUsername(username);
        if(userEntity==null){
            throw  new UsernameNotFoundException("User not found for "+username);
        }
        // i need to convert this user to the user that is understood by spring sec

        return new SecUser(userEntity);
    }
}
