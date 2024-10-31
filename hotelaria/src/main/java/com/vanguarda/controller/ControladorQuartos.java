package com.vanguarda.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoteis/{hotelId}/quartos")
public class ControladorQuartos {

    @GetMapping
    public String listarQuartos(@PathVariable Long hotelId) {
        return "Lista de Quartos do Hotel " + hotelId;
    }

//    @PostMapping
//    public String criarQuarto(@PathVariable Long hotelId, @RequestBody Quarto quarto) {
//        return "Quarto criado no Hotel " + hotelId + ": " + quarto.getNumero();
//    }
    
    @GetMapping("/disponiveis")
    public String listarQuartosDisponiveis(@PathVariable Long hotelId) {
        return "Lista de Quartos Disponíveis do Hotel " + hotelId;
    }

    @GetMapping("/{quartoId}")
    public String obterQuarto(@PathVariable Long hotelId, @PathVariable Long quartoId) {
        return "Detalhes do Quarto " + quartoId + " do Hotel " + hotelId;
    }

//    @PutMapping("/{quartoId}")
//    public String atualizarQuarto(@PathVariable Long hotelId, @PathVariable Long quartoId, @RequestBody Quarto quartoAtualizado) {
//        return "Quarto com ID " + quartoId + " no Hotel " + hotelId + " atualizado para: " + quartoAtualizado.getNumero();
//    }

    @DeleteMapping("/{quartoId}")
    public String removerQuarto(@PathVariable Long hotelId, @PathVariable Long quartoId) {
        return "Quarto removido: " + quartoId + " do Hotel " + hotelId;
    }	
	
}
