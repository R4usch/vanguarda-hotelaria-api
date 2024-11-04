package com.vanguarda.service;

import com.vanguarda.entity.Hotel;
import com.vanguarda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService{
    
    @Autowired
    private Hotelrepository hotelRepository;
    
    public List<Hotel> listarTodos() {
        return hotelRepository.findAll();
    }
    
    public Optional<Hotel> obterPorId(Integer id) {
        return hotelRepository.findById(id);
    }
    
    public Hotel salvar(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
    
    public void remover(Integer id) {
        hotelRepository.deleteById(id);
    }
}
