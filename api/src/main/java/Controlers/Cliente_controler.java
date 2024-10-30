package Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class Cliente_controler{

    @Autowired
    private Clienterepository clienteRepository;

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente obterCliente(@PathVariable String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        cliente.setIdCliente(id);
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable String id) {
        clienteRepository.deleteById(id);
    }
}
