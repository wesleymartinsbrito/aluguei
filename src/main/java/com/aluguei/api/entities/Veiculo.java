package com.aluguei.api.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "veiculo_id")
    private UUID id;
    @Column(name = "descricao_veiculo")
    private String descricao;
    @Column(name = "chassi_veiculo", nullable = false)
    private String chassi;
    @Column(name = "placa_veiculo", nullable = false)
    private String placa;
    @Column(name = "marca_veiculo", nullable = false)
    private String marca;
    @Column(name = "ano_fabricacao_veiculo", nullable = false)
    private Integer anoFabricacao;
    @Column(name = "km_atual_veiculo", nullable = false)
    private Integer kmAtual;

    public Veiculo(){

    }
    public Veiculo(String descricao, String chassi, String placa, String marca, Integer anoFabricacao, Integer kmAtual){
        this.descricao = descricao;
        this.chassi = chassi;
        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.kmAtual = kmAtual;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getChassi(){
        return chassi;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Integer getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(){
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getKmAtual(){
        return kmAtual;
    }

    public void setKmAtual(Integer kmAtual){
        this.kmAtual = kmAtual;
    }
}
