package com.company.akh.apiclient.config;

import az.kapitalbank.atlas.lib.common.config.annotation.EnableSecurity;
import az.kapitalbank.atlas.lib.common.provider.JwtTokenProvider;
import az.kapitalbank.atlas.lib.common.security.filter.JwtTokenFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.security.SecureRandom;
import java.util.Random;

@Configuration
@EnableSecurity
@EnableWebSecurity
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private static final String CONTENT_SECURITY_POLICY = "script-src 'self'";
    private static final String[] IGNORING_PATH = {
            "/v3/api-docs",
            "/actuator/health",
            "/actuator/prometheus",
            "/actuator/refresh"
    };

    private final JwtTokenProvider tokenProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .headers()
                .contentSecurityPolicy(CONTENT_SECURITY_POLICY)
                .and()
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .addFilterBefore(getFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring()
                .antMatchers(IGNORING_PATH)
                .antMatchers(HttpMethod.OPTIONS, "/**");
    }

    @Bean
    public Random secureRandom() {
        return new SecureRandom();
    }

    private JwtTokenFilter getFilter() {
        return new JwtTokenFilter(tokenProvider);
    }

}