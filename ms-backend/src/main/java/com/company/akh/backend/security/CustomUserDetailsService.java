package com.company.akh.backend.security;

import com.company.akh.backend.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var student = studentRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        log.info("Logged in user: {}", student);
        return User.builder()
                .username(username)
                .password(student.getPassword())
                .roles("ADMIN", "test")
                .build();
    }

}