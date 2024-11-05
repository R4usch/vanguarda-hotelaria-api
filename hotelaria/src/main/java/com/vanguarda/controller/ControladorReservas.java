package com.vanguarda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vanguarda.service.ReservaService;
import com.vanguarda.entity.Reserva;
import java.util.List;
import com.vanguarda.*;
@RestController
@RequestMapping("/hoteis/{hotelId}/reservas")
@CrossOrigin(origins = "*")
public class ControladorReservas {
    
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping
    public ResponseEntity<List<Reserva>> listarTodos(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(reservaService.listarPorHotel(hotelId));
    }
    
    @GetMapping("/{reservaId}")
    public ResponseEntity<Reserva> obterPorId(@PathVariable Integer reservaId) {
        return reservaService.obterPorId(reservaId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<Reserva> criar(@PathVariable Integer hotelId,
                                       @RequestParam String clienteId,
                                       @RequestParam String quartoId,
                                       @RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.salvar(hotelId, clienteId, quartoId, reserva));
    }
    
    @PutMapping("/{reservaId}")
    public ResponseEntity<Reserva> atualizar(@PathVariable Integer hotelId,
                                           @PathVariable Integer reservaId,
                                           @RequestBody Reserva reserva) {
        reserva.setIdReserva(reservaId);
        return ResponseEntity.ok(reservaService.atualizar(hotelId, reserva));
    }
    
    @DeleteMapping("/{reservaId}")
    public ResponseEntity<Void> remover(@PathVariable Integer reservaId) {
        reservaService.remover(reservaId);
        return ResponseEntity.noContent().build();
    }
}


