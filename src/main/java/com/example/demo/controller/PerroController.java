package com.example.demo.controller;

import com.example.demo.model.Perro;
import com.example.demo.service.PerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finalconstruccion/perros")
public class PerroController {

    @Autowired
    private PerroService perroService;

    @GetMapping
    public List<Perro> getAllPerros() {
        return perroService.getAll();
    }

    @GetMapping("/{perroId}")
    public ResponseEntity<Perro> getById(@PathVariable Long perroId) {
        Perro perro = perroService.getByPerroId(perroId);
        if (perro != null) {
            return ResponseEntity.ok(perro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Perro> createPerro(@RequestBody Perro perro) {
        Perro newPerro = perroService.addPerro(perro);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPerro);
    }

    @PutMapping("/{perroId}")
    public ResponseEntity<Perro> updatePerroById(@PathVariable Long perroId, @RequestBody Perro perro){
        Perro updaPerro = perroService.updatePerro(perroId, perro);
        if (updaPerro != null) {
            return ResponseEntity.ok(updaPerro);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{perroId}")
    public ResponseEntity<Void> deletePerroById(@PathVariable Long perroId){
        perroService.deletePerro(perroId);
        return ResponseEntity.noContent().build();
    }
}
