package com.vanguarda.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quarto {
    @Id
    private String idQuarto;
    @ManyToOne
    @JoinColumn(name = "hotel_idHotel")
    private Hotel hotel;
    private String tipoQuarto;

    // Getters e Setters
}