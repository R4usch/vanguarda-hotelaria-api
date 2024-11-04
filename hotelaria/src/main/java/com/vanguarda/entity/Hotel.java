package com.vanguarda.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "idHotel")
    private Integer idHotel;
    
    @Column(name = "nome", length = 30)
    private String nome;
    
    @Column(name = "rua", length = 30)
    private String rua;
    
    @Column(name = "bairro", length = 30)
    private String bairro;
    
    @Column(name = "cidade", length = 30)
    private String cidade;
    
    @Column(name = "estado", length = 30)
    private String estado;
    
    @Column(name = "cep", length = 15)
    private String cep;
    
    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

