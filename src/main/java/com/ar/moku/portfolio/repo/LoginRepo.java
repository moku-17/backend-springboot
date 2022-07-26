package com.ar.moku.portfolio.repo;

import com.ar.moku.portfolio.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Long> {
    
}
