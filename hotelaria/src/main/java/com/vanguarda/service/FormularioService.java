package com.vanguarda.service;


import com.vanguarda.entity.*;
import com.vanguarda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {
    
    @Autowired
    private Formulariorepository formularioRepository;
    
    @Autowired
    private Hotelrepository hotelRepository;
    
    @Autowired
    private Quartorepository quartoRepository;
    
    @Autowired
    private Clienterepository clienteRepository;
    
    public Formulario salvar(Integer hotelId, Formulario formulario) {
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new RuntimeException("Hotel não encontrado"));
        Quarto quarto = quartoRepository.findById(formulario.getQuarto().getIdQuarto())
                .orElseThrow(() -> new RuntimeException("Quarto não encontrado"));
        Cliente cliente = clienteRepository.findById(formulario.getCliente().getIdCliente())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        
        formulario.setHotel(hotel);
        formulario.setQuarto(quarto);
        formulario.setCliente(cliente);
        
        return formularioRepository.save(formulario);
    }
}