package com.aluguei.api.services;

import com.aluguei.api.entities.Marca;
import com.aluguei.api.exceptions.DadosIncompletosException;
import com.aluguei.api.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    private Marca marca;

    public Optional<Marca> findById(UUID uuid){
       return marcaRepository.findById(uuid);
    }

    public List<Marca> findAll(){
        return marcaRepository.findAll();
    }

    public Marca insert(Marca marca){
        if (marca.getNome() == null || marca.getId() == null) {
            throw new DadosIncompletosException("Dados incompletos.");
        }
        return marcaRepository.save(marca);
    }
}
