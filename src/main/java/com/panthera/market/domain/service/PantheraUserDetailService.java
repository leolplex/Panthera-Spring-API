package com.panthera.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PantheraUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) {
        return new User("Daniel", "{noop}panthera", new ArrayList<>());
    }
}
