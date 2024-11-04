package com.vanguarda.repository;

import com.vanguarda.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hotelrepository extends JpaRepository<Hotel, Integer> {
}