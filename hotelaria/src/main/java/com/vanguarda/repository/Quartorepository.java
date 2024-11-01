package com.vanguarda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vanguarda.entity.Quarto;
public interface Quartorepository extends JpaRepository<Quarto, String> {
    long countByHotelIdHotel(Integer hotelId);  // Conta os quartos disponíveis por hotel
}
