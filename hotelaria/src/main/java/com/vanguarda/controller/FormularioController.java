package com.vanguarda.controller;

import com.vanguarda.entity.Formulario;
import com.vanguarda.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hoteis/{hotelId}/formularios")
@CrossOrigin(origins = "*")
public class FormularioController {
    
    @Autowired
    private FormularioService formularioService;
    
    @PostMapping
    public ResponseEntity<Formulario> criar(@PathVariable Integer hotelId, @RequestBody Formulario formulario) {
        return ResponseEntity.ok(formularioService.salvar(hotelId, formulario));
    }
}
