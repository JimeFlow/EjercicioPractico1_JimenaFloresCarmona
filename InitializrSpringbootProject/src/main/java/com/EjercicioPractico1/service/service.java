package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.libros;
import java.util.List;

public interface service {
    public List<libros> getlibros(boolean activos);
}
