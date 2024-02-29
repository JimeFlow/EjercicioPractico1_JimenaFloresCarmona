package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.dao;
import com.EjercicioPractico1.domain.libros;
import com.EjercicioPractico1.service.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class impl implements service{

    @Autowired
    private dao dao;
    
    @Override    
    @Transactional(readOnly=true)
    public List<libros> getlibros(boolean activos) {
        var lista=dao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
