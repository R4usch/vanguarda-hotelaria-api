package Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hoteis")
public class Hotel_controler {

    @Autowired
    private QuartoRepository quartoRepository;

    @GetMapping("/quartos/disponiveis/{hotelId}")
    public long quartosDisponiveis(@PathVariable Integer hotelId) {
        return quartoRepository.countByHotelIdHotel(hotelId);
    }
}
