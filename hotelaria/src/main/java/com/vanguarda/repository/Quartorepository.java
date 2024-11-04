package com.vanguarda.repository;

import com.vanguarda.entity.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface Quartorepository extends JpaRepository<Quarto, String> {
    List<Quarto> findByHotelIdHotel(Integer hotelId);
    List<Quarto> findByHotelIdHotelAndReservado(Integer hotelId, Boolean reservado);
}