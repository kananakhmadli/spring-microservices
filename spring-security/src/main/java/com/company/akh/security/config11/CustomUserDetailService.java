package com.company.akh.security.config11;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, String> users = new HashMap<>();
        users.put("kanan", passwordEncoder.encode("1234"));

        if (users.containsKey(username))
            return User.builder()
                    .username(username)
                    .password(users.get(username))
                    .roles("admin")
                    .build();

        throw new UsernameNotFoundException(username);
    }

}