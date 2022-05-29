package com.panser.f1statistics.controller;

import com.panser.f1statistics.entity.Driver;
import com.panser.f1statistics.repository.DriverRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drivers")
public class DriverController {

    private final DriverRepository driverRepository;

    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping
    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    @GetMapping("/{code}")
    public List<Driver> findByCode(@PathVariable String code) {
        return driverRepository.findByCode(code);
    }

    @GetMapping("/{year}")
    public List<Driver> findByYear(@PathVariable Integer year) {

    }
}
