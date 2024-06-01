package com.example.demo.service;

import com.example.demo.model.Perro;

import java.util.List;

public interface PerroService {
    List<Perro> getAll();
    Perro getByPerroId(Long perroId);
    Perro addPerro(Perro perro);
    Perro updatePerro(Long perroId, Perro newperro);
    void deletePerro(Long perroId);
}
