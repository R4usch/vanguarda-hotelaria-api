package Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formularios")
public class Formulario_controler {

    @Autowired
    private Formulariorepository formularioRepository; // Assumindo que você tenha criado um FormularioRepository

    @PostMapping
    public Formulario criarFormulario(@RequestBody Formulario formulario) {
        return formularioRepository.save(formulario);
    }

    @GetMapping("/{id}")
    public Formulario obterFormulario(@PathVariable Integer id) {
        return formularioRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Formulario> listarFormularios() {
        return formularioRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarFormulario(@PathVariable Integer id) {
        formularioRepository.deleteById(id);
    }
}
