package com.example.sih.controller;

import com.example.sih.model.Candidate;
import com.example.sih.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    // POST endpoint: /api/recommend
    @PostMapping("/recommend")
    public List<Map<String, Object>> getRecommendations(@RequestBody Candidate candidate) {
        return recommendationService.recommend(candidate);
    }
}
