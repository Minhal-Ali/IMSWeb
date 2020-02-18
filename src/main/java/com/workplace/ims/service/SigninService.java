package com.workplace.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigninService {
    @Autowired
    public SigninService(){ }
    public static Boolean performSignIn(String userid,String password){
        return userid.equals("Minhal") && password.equals("123qwerty");
    }
}
