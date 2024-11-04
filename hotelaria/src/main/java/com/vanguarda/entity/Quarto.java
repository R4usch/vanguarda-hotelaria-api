package com.vanguarda.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quarto")
public class Quarto {
    @Id
    @Column(name = "id_quarto", length = 45)
    private String idQuarto;
    
    @ManyToOne
    @JoinColumn(name = "hotel_idHotel")
    private Hotel hotel;
    
    @Column(name = "tipo_quarto", length = 45)
    private String tipoQuarto;
    
    @Column(name = "reservado")
    private Boolean reservado;
    
    public String getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(String idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void setReservado(Boolean reservado) {
        this.reservado = reservado;
    }
}

