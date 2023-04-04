package com.company.akh.postgres.config;

import com.company.akh.postgres.mapper.AddressMapper;
import com.company.akh.postgres.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public UserMapper userMapper() {
        return UserMapper.INSTANCE;
    }

    @Bean
    public AddressMapper addressMapper() {
        return AddressMapper.INSTANCE;
    }

}