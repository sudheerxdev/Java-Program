package com.example.sih.service;

import com.example.sih.model.Candidate;
import com.example.sih.model.Internship;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    // Sample internships data (later DB से आ सकता है)
    private final List<Internship> internships = List.of(
            new Internship("Community Health Volunteer", "UG - B.Sc",
                    List.of("MS Office", "Communication"), "Healthcare", "Odisha", "3 months"),

            new Internship("IT Support Internship", "UG - B.Tech",
                    List.of("Troubleshooting", "Data Entry"), "IT Services", "Remote", "2 months"),

            new Internship("Data Analyst Intern", "UG - B.Sc",
                    List.of("Python", "SQL", "MS Excel"), "IT Services", "Delhi", "3 months")
    );

    // Calculate match score
    private int calculateScore(Candidate candidate, Internship jd) {
        int score = 0;

        // Education match
        if (candidate.getEducation().toLowerCase().contains(jd.getEducationRequired().toLowerCase())) {
            score += 20;
        }

        // Skills match
        List<String> matchedSkills = candidate.getSkills().stream()
                .filter(skill -> jd.getSkillsRequired().stream()
                        .map(String::toLowerCase).toList()
                        .contains(skill.toLowerCase()))
                .toList();
        score += (int) (((double) matchedSkills.size() / jd.getSkillsRequired().size()) * 50);

        // Sector match
        if (candidate.getSectorInterest().equalsIgnoreCase(jd.getSector())) {
            score += 20;
        }

        // Location match
        if (candidate.getLocation().equalsIgnoreCase(jd.getLocation())) {
            score += 10;
        } else if (jd.getLocation().equalsIgnoreCase("remote")) {
            score += 5;
        }

        return score;
    }

    // Recommend top 3–5 internships
    public List<Map<String, Object>> recommend(Candidate candidate) {
        return internships.stream()
                .map(jd -> {
                    Map<String, Object> result = new HashMap<>();
                    result.put("title", jd.getTitle());
                    result.put("location", jd.getLocation());
                    result.put("duration", jd.getDuration());
                    result.put("sector", jd.getSector());
                    result.put("score", calculateScore(candidate, jd));
                    return result;
                })
                .sorted((a, b) -> (int) b.get("score") - (int) a.get("score"))
                .limit(5)
                .collect(Collectors.toList());
    }
}
