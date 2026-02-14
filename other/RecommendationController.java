package com.example.sih.controller;

import com.example.sih.model.Candidate;
import com.example.sih.model.Internship;
import com.example.sih.service.RecommendationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @PostMapping("/recommend")
    public List<Internship> recommend(@RequestBody Candidate candidate) {
        return recommendationService.recommendInternships(candidate);
    }
}
