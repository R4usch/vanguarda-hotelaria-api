package com.vanguarda.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "id_cliente", length = 15)
    private String idCliente;
    
    @Column(name = "senha", length = 10)
    private String senha;
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}


