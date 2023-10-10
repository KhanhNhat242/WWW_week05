package com.example.WWW_week05.services;

import com.example.WWW_week05.models.Address;
import com.example.WWW_week05.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address createOrUpdate(Address a){
        return addressRepository.save(a);
    }

    public void delete(long id){
        addressRepository.deleteById(id);
    }

    public Address findById(long id){
        return addressRepository.findById(id).get();
    }

    public List<Address> findAll(){
        return addressRepository.findAll();
    }
}
