package com.ecommerce.Go_ecom.Controller;

import com.ecommerce.Go_ecom.model.User;
import com.ecommerce.Go_ecom.payload.AddressDTO;
import com.ecommerce.Go_ecom.service.AddressService;
import com.ecommerce.Go_ecom.util.AuthUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {
    @Autowired
    AuthUtil authUtil;

    @Autowired
    AddressService addressService;

    @PostMapping("/addresses")
    public ResponseEntity<AddressDTO> createAddress(@Valid @RequestBody AddressDTO addressDTO) {
        User user = authUtil.loggedInUser();
        AddressDTO savedAddressDTO = addressService.createAddress(addressDTO , user);

        return  new ResponseEntity<>(savedAddressDTO,HttpStatus.CREATED);
    }

    @GetMapping("/addresses")
    public ResponseEntity <List<AddressDTO>> getAddress() {
       List <AddressDTO> addressList = addressService.getAddress();

        return new ResponseEntity<>(addressList,HttpStatus.OK);
    }
}
