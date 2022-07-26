package com.ar.moku.portfolio;

import com.ar.moku.portfolio.model.Login;
import com.ar.moku.portfolio.service.LoginService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginResource {

    private final LoginService loginService;

    public LoginResource(LoginService loginService) {
        this.loginService = loginService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Login>> getAllLogins() {
        List<Login> logins = loginService.findAllLogins();
        return new ResponseEntity<>(logins, HttpStatus.OK);
    }
}
