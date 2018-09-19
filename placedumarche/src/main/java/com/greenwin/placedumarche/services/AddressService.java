package com.greenwin.placedumarche.services;

import com.greenwin.placedumarche.entities.Address;
import com.greenwin.placedumarche.entities.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public void addAddress(Address address){
        addressRepository.save(address);
    }
}
