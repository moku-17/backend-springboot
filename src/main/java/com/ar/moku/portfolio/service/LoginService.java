package com.ar.moku.portfolio.service;

import com.ar.moku.portfolio.model.Login;
import com.ar.moku.portfolio.repo.LoginRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final LoginRepo loginRepo;

    @Autowired
    public LoginService(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

    public List<Login> findAllLogins() {
        return loginRepo.findAll();
    }

}