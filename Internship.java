package com.example.sih.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Internship {
    private String title;
    private String educationRequired;
    private List<String> skillsRequired;
    private String sector;
    private String location;
    private String duration;            // e.g. "3 months"
}
