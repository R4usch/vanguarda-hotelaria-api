package com.vanguarda.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoteis")
public class ControladorHoteis {

    @GetMapping
    public String listarHoteis() {
        return "Lista de Hotéis";
    }

//    @PostMapping
//    public String criarHotel(@RequestBody Hotel hotel) {
//        return "Hotel criado: " + hotel.getNome() + ", Endereço: " + hotel.getEndereco();
//    } 
    
    @GetMapping("/{hotelId}")
    public String obterHotel(@PathVariable Long hotelId) {
        return "Detalhes do Hotel " + hotelId;
    }

//    @PutMapping("/{hotelId}")
//    public String atualizarHotel(@PathVariable Long hotelId, @RequestBody Hotel hotelAtualizado) {
//        return "Hotel com ID " + hotelId + " atualizado para: " + hotelAtualizado.getNome();
//    }

    @DeleteMapping("/{hotelId}")
    public String removerHotel(@PathVariable Long hotelId) {
        return "Hotel removido: " + hotelId;
    }
    
}
