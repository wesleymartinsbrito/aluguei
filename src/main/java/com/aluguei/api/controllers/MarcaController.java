package com.aluguei.api.controllers;

import com.aluguei.api.entities.Marca;
import com.aluguei.api.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @Autowired
    private Marca marca;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Marca>> findById(@PathVariable UUID id){
        return ResponseEntity.ok().body(marcaService.findById(id));
    }

    public ResponseEntity<List<Marca>> findAll(){
        return ResponseEntity.ok().body(marcaService.findAll());
    }

    public ResponseEntity<Marca> insert(@RequestBody Marca marca) {
        return ResponseEntity.ok().body(marcaService.insert(marca));
    }
}
