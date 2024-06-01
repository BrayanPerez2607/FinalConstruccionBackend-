package com.example.demo.service;

import com.example.demo.model.Perro;
import com.example.demo.repository.PerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerroServiceImpl implements PerroService {

    @Autowired
    private PerroRepository perroRepository;

    @Override
    public List<Perro> getAll() {return perroRepository.findAll();}

    @Override
    public Perro getByPerroId(Long perroId){
        return perroRepository.findById(perroId).orElse(null);
    }

    @Override
    public Perro addPerro(Perro perro) {
        return perroRepository.save(perro);
    }

    @Override
    public Perro updatePerro(Long perroId, Perro newperro){
        Perro existentPerro = getByPerroId(perroId);
        if (existentPerro != null) {
            newperro.setPerroId(perroId);
            return perroRepository.save(newperro);
        }
        return null;
    }

    @Override
    public void deletePerro(Long perroId) {
        perroRepository.deleteById(perroId);
    }

}
