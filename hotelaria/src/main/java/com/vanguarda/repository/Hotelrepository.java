package com.vanguarda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vanguarda.entity.Hotel;
public interface Hotelrepository extends JpaRepository<Hotel, Integer> {}
