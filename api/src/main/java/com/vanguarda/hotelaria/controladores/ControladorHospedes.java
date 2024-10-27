package com.vanguarda.hotelaria.controladores;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoteis/{hotelId}/hospedes")
public class ControladorHospedes {

    @GetMapping
    public String listarHospedes(@PathVariable Long hotelId) {
        return "Lista de Hóspedes do Hotel " + hotelId;
    }

    @PostMapping
    public String criarHospede(@PathVariable Long hotelId, @RequestBody Hospede hospede) {
        return "Hóspede criado no Hotel " + hotelId + ": " + hospede.getNome();
    }

    @GetMapping("/{hospedeId}")
    public String obterHospede(@PathVariable Long hotelId, @PathVariable Long hospedeId) {
        return "Detalhes do Hóspede " + hospedeId + " do Hotel " + hotelId;
    }

    @PutMapping("/{hospedeId}")
    public String atualizarHospede(@PathVariable Long hotelId, @PathVariable Long hospedeId, @RequestBody Hospede hospedeAtualizado) {
        return "Hóspede com ID " + hospedeId + " no Hotel " + hotelId + " atualizado para: " + hospedeAtualizado.getNome();
    }

    @DeleteMapping("/{hospedeId}")
    public String removerHospede(@PathVariable Long hotelId, @PathVariable Long hospedeId) {
        return "Hóspede removido: " + hospedeId + " do Hotel " + hotelId;
    }
    
}
