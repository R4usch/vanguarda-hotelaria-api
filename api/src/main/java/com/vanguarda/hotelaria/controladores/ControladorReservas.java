package com.vanguarda.hotelaria.controladores;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoteis/{hotelId}/reservas")
public class ControladorReservas {

    @GetMapping
    public String listarReservas(@PathVariable Long hotelId) {
        return "Lista de Reservas do Hotel " + hotelId;
    }

    @PostMapping
    public String criarReserva(@PathVariable Long hotelId, @RequestBody Reserva reserva) {
        return "Reserva criada no Hotel " + hotelId + " para o Hóspede " + reserva.getHospedeId();
    }

    @GetMapping("/{reservaId}")
    public String obterReserva(@PathVariable Long hotelId, @PathVariable Long reservaId) {
        return "Detalhes da Reserva " + reservaId + " do Hotel " + hotelId;
    }

    @PutMapping("/{reservaId}")
    public String atualizarReserva(@PathVariable Long hotelId, @PathVariable Long reservaId, @RequestBody Reserva reservaAtualizada) {
        return "Reserva com ID " + reservaId + " no Hotel " + hotelId + " atualizada";
    }

    @DeleteMapping("/{reservaId}")
    public String cancelarReserva(@PathVariable Long hotelId, @PathVariable Long reservaId) {
        return "Reserva cancelada: " + reservaId + " do Hotel " + hotelId;
    }	
	
}
