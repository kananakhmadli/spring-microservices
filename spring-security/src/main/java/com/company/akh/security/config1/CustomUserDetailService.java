package com.company.akh.security.config1;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String result = passwordEncoder.encode("1234");
        UserDetails userDetails1 = User.withUsername("kanan")
                .password(result)
                .roles("admin")
                .build();

        UserDetails userDetails2 = User.builder()
                .username("kanan")
                .password(result)
                .roles("admin")
                .build();

        return userDetails2;
    }

}