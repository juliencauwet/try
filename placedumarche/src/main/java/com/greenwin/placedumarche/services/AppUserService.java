package com.greenwin.placedumarche.services;

import com.greenwin.placedumarche.entities.AppUser;
import com.greenwin.placedumarche.entities.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public void addAppUser(AppUser appUser){
        appUserRepository.save(appUser);
    }
}
