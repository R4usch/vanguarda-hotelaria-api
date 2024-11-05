package com.vanguarda.controller;



import com.vanguarda.entity.Cliente;
import com.vanguarda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.vanguarda.*;
@RestController
@RequestMapping("/hoteis/{hotelId}/clientes")
@CrossOrigin(origins = "*")
public class ControladorHospedes {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(clienteService.listarPorHotel(hotelId));
    }
    
    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> obterPorId(@PathVariable String clienteId) {
        return clienteService.obterPorId(clienteId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<Cliente> criar(@PathVariable Integer hotelId, @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.salvar(hotelId, cliente));
    }
    
    @PutMapping("/{clienteId}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Integer hotelId,
                                           @PathVariable String clienteId,
                                           @RequestBody Cliente cliente) {
        cliente.setIdCliente(clienteId);
        return ResponseEntity.ok(clienteService.atualizar(hotelId, cliente));
    }
    
    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> remover(@PathVariable String clienteId) {
        clienteService.remover(clienteId);
        return ResponseEntity.noContent().build();
    }
}

