package com.panser.f1statistics.controller;

import com.panser.f1statistics.entity.Circuit;
import com.panser.f1statistics.repository.CircuitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("circuits")
public class CircuitController {

    private final CircuitRepository circuitRepository;

    public CircuitController(CircuitRepository circuitRepository) {
        this.circuitRepository = circuitRepository;
    }

    @GetMapping
    public List<Circuit> findAll() {
        return circuitRepository.findAll();
    }

    @GetMapping("/{year}")
    public
}
