package com.aluguei.api.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nome_marca", nullable = false, length = 40)
    private String nome;

    public Marca(){

    }

    public Marca(String nome){
        this.nome = nome;
    }

    public UUID getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
