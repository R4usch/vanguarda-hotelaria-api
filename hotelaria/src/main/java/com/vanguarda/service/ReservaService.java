package com.vanguarda.service;


import com.vanguarda.entity.*;
import com.vanguarda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    
    @Autowired
    private Reservarepository reservaRepository;
    
    @Autowired
    private Hotelrepository hotelRepository;
    
    @Autowired
    private Quartorepository quartoRepository;
    
    @Autowired
    private Clienterepository clienteRepository;
    
    public List<Reserva> listarPorHotel(Integer hotelId) {
        return reservaRepository.findByHotelIdHotel(hotelId);
    }
    
    public Optional<Reserva> obterPorId(Integer id) {
        return reservaRepository.findById(id);
    }
    
    public Reserva salvar(Integer hotelId, String clienteId, String quartoId, Reserva reserva) {
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new RuntimeException("Hotel não encontrado"));
        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        Quarto quarto = quartoRepository.findById(quartoId)
                .orElseThrow(() -> new RuntimeException("Quarto não encontrado"));
        
        reserva.setHotel(hotel);
        reserva.setCliente(cliente);
        reserva.setQuarto(quarto);
        quarto.setReservado(true);
        
        return reservaRepository.save(reserva);
    }
    
    public Reserva atualizar(Integer hotelId, Reserva reserva) {
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new RuntimeException("Hotel não encontrado"));
        reserva.setHotel(hotel);
        return reservaRepository.save(reserva);
    }
    
    public void remover(Integer id) {
        Reserva reserva = reservaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserva não encontrada"));
        Quarto quarto = reserva.getQuarto();
        quarto.setReservado(false);
        reservaRepository.deleteById(id);
    }
}

