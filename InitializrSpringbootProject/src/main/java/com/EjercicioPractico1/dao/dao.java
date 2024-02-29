package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dao extends JpaRepository <libros,Long>{
    
}
