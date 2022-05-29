package com.panser.f1statistics.controller;

import com.panser.f1statistics.dto.BestResult;
import com.panser.f1statistics.repository.ResultRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("best-result")
public class BestResultController {

    private final ResultRepository resultRepository;

    public BestResultController(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @GetMapping("/{year}")
    public List<BestResult> bestResultsByYear(@PathVariable Integer year) {
        return resultRepository.findByYear(year);
    }
}
