package com.vanguarda.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHotel;
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    // Getters e Setters
}