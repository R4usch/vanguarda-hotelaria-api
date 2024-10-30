import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class Reserva_controler {

    @Autowired
    private Reservarepository reservaRepository;

    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @GetMapping("/{id}")
    public Reserva obterReserva(@PathVariable Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarReserva(@PathVariable Integer id) {
        reservaRepository.deleteById(id);
    }
}
