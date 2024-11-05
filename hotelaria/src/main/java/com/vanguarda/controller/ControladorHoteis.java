package com.vanguarda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.vanguarda.repository.*;
import com.vanguarda.service.HotelService;
import com.vanguarda.entity.Hotel;
import com.vanguarda.*;
@RestController
@RequestMapping("/hoteis")
@CrossOrigin(origins = "*")
public class ControladorHoteis {
    
    @Autowired
    private HotelService hotelService;
    
    @GetMapping
    public ResponseEntity<List<Hotel>> listarTodos() {
    	System.out.println("Funcionando rota");
        return ResponseEntity.ok(hotelService.listarTodos());
    }
    
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> obterPorId(@PathVariable Integer hotelId) {
        return hotelService.obterPorId(hotelId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<Hotel> criar(@RequestBody Hotel hotel) {
        return ResponseEntity.ok(hotelService.salvar(hotel));
    }
    
    @PutMapping("/{hotelId}")
    public ResponseEntity<Hotel> atualizar(@PathVariable Integer hotelId, @RequestBody Hotel hotel) {
        hotel.setIdHotel(hotelId);
        return ResponseEntity.ok(hotelService.salvar(hotel));
    }
    
    @DeleteMapping("/{hotelId}")
    public ResponseEntity<Void> remover(@PathVariable Integer hotelId) {
        hotelService.remover(hotelId);
        return ResponseEntity.noContent().build();
    }
}



