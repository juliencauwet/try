package com.greenwin.placedumarche.controller;

import com.greenwin.placedumarche.entities.Address;
import com.greenwin.placedumarche.entities.AppUser;
import com.greenwin.placedumarche.services.AddressService;
import com.greenwin.placedumarche.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserProfileController {

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private AddressService addressService;

    @GetMapping("/userprofile")
    public String displayform(){
        return "userprofile";
    }

    @PostMapping("/userprofile")
    public String addUserForm(@ModelAttribute AppUser appUser, @ModelAttribute Address address){
        System.out.println("AddUserForm");
        appUserService.addAppUser(appUser);
        addressService.addAddress(address);

        return "contactsuccess";
    }
}
