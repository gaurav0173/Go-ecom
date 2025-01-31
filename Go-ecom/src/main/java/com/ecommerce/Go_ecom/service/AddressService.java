package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.model.User;
import com.ecommerce.Go_ecom.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAddress();

    AddressDTO getAddressById(Long addressId);
}
