package com.vanguarda.repository;

import java.util.List;
import com.vanguarda.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reservarepository extends JpaRepository<Reserva, Integer> {
    List<Reserva> findByClienteIdCliente(String clienteId);
}
