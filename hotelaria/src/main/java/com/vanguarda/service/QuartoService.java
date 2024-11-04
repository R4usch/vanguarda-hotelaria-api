package com.vanguarda.service;

import com.vanguarda.entity.*;
import com.vanguarda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class QuartoService {
    
    @Autowired
    private Quartorepository quartoRepository;
    
    @Autowired
    private Hotelrepository hotelRepository;
    
    public List<Quarto> listarPorHotel(Integer hotelId) {
        return quartoRepository.findByHotelIdHotel(hotelId);
    }
    
    public List<Quarto> listarDisponiveisPorHotel(Integer hotelId) {
        return quartoRepository.findByHotelIdHotelAndReservado(hotelId, false);
    }
    
    public Optional<Quarto> obterPorId(String id) {
        return quartoRepository.findById(id);
    }
    
    public Quarto salvar(Integer hotelId, Quarto quarto) {
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new RuntimeException("Hotel não encontrado"));
        quarto.setHotel(hotel);
        return quartoRepository.save(quarto);
    }
    
    public void remover(String id) {
        quartoRepository.deleteById(id);
    }
}

