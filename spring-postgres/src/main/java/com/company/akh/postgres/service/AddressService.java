package com.company.akh.postgres.service;

import com.company.akh.postgres.mapper.AddressMapper;
import com.company.akh.postgres.dto.AddressDto;
import com.company.akh.postgres.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressMapper addressMapper;
    private final AddressRepository addressRepository;

    public List<AddressDto> getAllAddress() {
        return addressMapper.toAddressDtoList(addressRepository.findAll());
    }

}