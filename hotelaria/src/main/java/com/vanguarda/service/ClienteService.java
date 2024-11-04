package com.vanguarda.service;


import com.vanguarda.entity.*;
import com.vanguarda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    
    @Autowired
    private Clienterepository clienteRepository;
    
    @Autowired
    private Hotelrepository hotelRepository;
    
    public List<Cliente> listarPorHotel(Integer hotelId) {
        // Implementar lógica para listar clientes por hotel
        // Usando as tabelas de Reserva e Cliente
        return null;
    }
    
    public Optional<Cliente> obterPorId(String id) {
        return clienteRepository.findById(id);
    }
    
    public Cliente salvar(Integer hotelId, Cliente cliente) {
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new RuntimeException("Hotel não encontrado"));
        // Implementar lógica para associar cliente ao hotel
        return clienteRepository.save(cliente);
    }
    
    public Cliente atualizar(Integer hotelId, Cliente cliente) {
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new RuntimeException("Hotel não encontrado"));
        // Implementar lógica para atualizar cliente associado ao hotel
        return clienteRepository.save(cliente);
    }
    
    public void remover(String id) {
        clienteRepository.deleteById(id);
    }
}