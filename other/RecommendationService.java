package com.example.sih.service;

import com.example.sih.model.Candidate;
import com.example.sih.model.Internship;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    private final List<Internship> internships = new ArrayList<>();

    public RecommendationService() {
        // ✅ Dummy 100 realistic JDs
        String[] sectors = {"IT Services", "Healthcare", "Finance", "Education", "Manufacturing"};
        String[] locations = {"Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai", "Remote"};

        for (int i = 1; i <= 100; i++) {
            Internship internship = new Internship();
            internship.setTitle("Internship Role " + i);
            internship.setSector(sectors[i % sectors.length]);
            internship.setLocation(locations[i % locations.length]);
            internship.setDuration((1 + (i % 6)) + " months");
            internship.setMatchScore(0); // default
            internships.add(internship);
        }
    }

    public List<Internship> recommendInternships(Candidate candidate) {
        for (Internship internship : internships) {
            int score = 0;

            // ✅ Sector matching
            if (candidate.getSectorInterest() != null &&
                    candidate.getSectorInterest().equalsIgnoreCase(internship.getSector())) {
                score += 30;
            }

            // ✅ Location matching
            if (candidate.getLocation() != null &&
                    candidate.getLocation().equalsIgnoreCase(internship.getLocation())) {
                score += 20;
            }

            // ✅ Skills matching (title में अगर skill हो तो +10 per skill)
            if (candidate.getSkills() != null) {
                for (String skill : candidate.getSkills()) {
                    if (internship.getTitle().toLowerCase().contains(skill.toLowerCase())) {
                        score += 10;
                    }
                }
            }

            internship.setMatchScore(Math.min(score, 100)); // Cap at 100
        }

        // ✅ Top 10 best matches return
        return internships.stream()
                .sorted(Comparator.comparingInt(Internship::getMatchScore).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
}
