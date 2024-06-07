package com.example.lab3.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.lab3.entitties.Carro;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Carros")
public class CarroController {

    private List<Carro> carros = new ArrayList<>();
    private long currentId = 1;

    @GetMapping
    public List<Carro> findAll() {
        return carros;
    }

    @GetMapping("/{id}")
    public Carro findById(@PathVariable Long id) {
        Optional<Carro> carroOptional = carros.stream().filter(carro -> carro.getId().equals(id)).findFirst();
        return carroOptional.orElse(null);
    }

    @PostMapping
    public Carro insert(@RequestBody Carro carro) {
        carro.setId(currentId++);
        carros.add(carro);
        return carro;
    }

    @PutMapping("/{id}")
    public Carro update(@PathVariable Long id, @RequestBody Carro carro) {
        Optional<Carro> carroOptional = carros.stream().filter(c -> c.getId().equals(id)).findFirst();
        if (carroOptional.isPresent()) {
            Carro existingCarro = carroOptional.get();
            existingCarro.setModelo(carro.getModelo());
            existingCarro.setMarca(carro.getMarca());
            existingCarro.setPreco(carro.getPreco());
            return existingCarro;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carros.removeIf(carro -> carro.getId().equals(id));
    }
}
