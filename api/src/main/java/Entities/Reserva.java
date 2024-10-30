package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "cliente_idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "hotel_idHotel")
    private Hotel hotel;

    // Getters e Setters
}