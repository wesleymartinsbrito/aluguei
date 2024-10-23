package com.aluguei.api;

import com.aluguei.api.entities.Marca;
import com.aluguei.api.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public Optional<Marca> findById(UUID uuid){
       return marcaRepository.findById(uuid);
    }
}
