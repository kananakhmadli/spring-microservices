package com.company.akh.postgres.service;

import com.company.akh.postgres.mapper.AddressMapper;
import com.company.akh.postgres.dto.UserDto;
import com.company.akh.postgres.mapper.UserMapper;
import com.company.akh.postgres.repository.AddressRepository;
import com.company.akh.postgres.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final UserMapper userMapper;
    private final AddressMapper addressMapper;

    @Transactional
    public UserDto save(UserDto request) {
        var users = userMapper.toUser(request);

        var addresses = addressMapper.mapToAddress(request.getAddresses());
        addresses.forEach(address -> address.setUsers(users));

        var userDb = userRepository.save(users);
        addressRepository.saveAll(addresses);
        request.setId(userDb.getUsersId());
        return request;
    }

    public List<UserDto> getAllUsers() {
        return userMapper.toUserDtoList(userRepository.findAll());
    }

}