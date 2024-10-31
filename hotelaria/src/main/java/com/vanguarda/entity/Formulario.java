package com.vanguarda.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormulario;
    private String nome;
    private String sobrenome;
    private String enderecoEmail;
    private String telefone;
    private String cpf;
    private java.sql.Date data;
    private java.sql.Date dataEntrada;
    private java.sql.Date dataSaida;

    @ManyToOne
    @JoinColumn(name = "cliente_idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "hotel_idHotel")
    private Hotel hotel;

    // Getters e Setters
}
