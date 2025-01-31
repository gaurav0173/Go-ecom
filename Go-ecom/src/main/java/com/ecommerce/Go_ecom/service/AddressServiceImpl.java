package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.model.Address;
import com.ecommerce.Go_ecom.model.User;
import com.ecommerce.Go_ecom.payload.AddressDTO;
import com.ecommerce.Go_ecom.repositories.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public AddressDTO createAddress(AddressDTO addressDTO, User user) {
        Address address = modelMapper.map(addressDTO, Address.class);
        List<Address> addressList = user.getAddresses();
        addressList.add(address);
        user.setAddresses(addressList);

        address.setUser( user);
        Address savedAddress = addressRepository.save(address);
        return modelMapper.map(savedAddress , AddressDTO.class);
    }
}
