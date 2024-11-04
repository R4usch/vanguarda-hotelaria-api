package com.vanguarda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vanguarda.service.QuartoService;
import com.vanguarda.entity.Quarto;
import com.vanguarda.repository.*;
import java.util.List;

@RestController
@RequestMapping("/hoteis/{hotelId}/quartos")
@CrossOrigin(origins = "*")
public class ControladorQuartos {
    
    @Autowired
    private QuartoService quartoService;
    
    @GetMapping
    public ResponseEntity<List<Quarto>> listarTodos(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(quartoService.listarPorHotel(hotelId));
    }
    
    @GetMapping("/disponiveis")
    public ResponseEntity<List<Quarto>> listarDisponiveis(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(quartoService.listarDisponiveisPorHotel(hotelId));
    }
    
    @GetMapping("/{quartoId}")
    public ResponseEntity<Quarto> obterPorId(@PathVariable String quartoId) {
        return quartoService.obterPorId(quartoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<Quarto> criar(@PathVariable Integer hotelId, @RequestBody Quarto quarto) {
        return ResponseEntity.ok(quartoService.salvar(hotelId, quarto));
    }
    
    @PutMapping("/{quartoId}")
    public ResponseEntity<Quarto> atualizar(@PathVariable Integer hotelId,
                                          @PathVariable String quartoId,
                                          @RequestBody Quarto quarto) {
        quarto.setIdQuarto(quartoId);
        return ResponseEntity.ok(quartoService.salvar(hotelId, quarto));
    }
    
    @DeleteMapping("/{quartoId}")
    public ResponseEntity<Void> remover(@PathVariable String quartoId) {
        quartoService.remover(quartoId);
        return ResponseEntity.noContent().build();
    }
}
