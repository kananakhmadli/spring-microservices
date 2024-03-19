//package com.company.akh.security.config2;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.StandardPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class SecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http
//                .authorizeHttpRequests()
//                .antMatchers("/security/dashboard").hasAnyRole("admin")
//                .and()
//                .authorizeHttpRequests()
//                .antMatchers("/security/home")
//                .permitAll()
//                .and()
//                .httpBasic()
//                .and()
//                .formLogin()// bunu etməsək popup kimi loging çıxacaq
//                .disable();
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        Map<String, PasswordEncoder> encoders = new HashMap<>();
//        encoders.put("bcrypt", new BCryptPasswordEncoder(5));
//        encoders.put("sha256", new StandardPasswordEncoder());
//        encoders.put("noop", NoOpPasswordEncoder.getInstance());
//        return new DelegatingPasswordEncoder("bcrypt", encoders);
//    }
//
//}