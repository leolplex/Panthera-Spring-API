package com.panthera.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PantheraUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordEncode = passwordEncoder.encode("panthera");
        return new User("Daniel", passwordEncode, new ArrayList<>());
    }
}
