package com.example.sih.model;

import lombok.Data;
import java.util.List;

@Data
public class Candidate {
    private String education;           // e.g. "UG - B.Sc"
    private List<String> skills;        // e.g. ["MS Office", "Communication"]
    private String sectorInterest;      // e.g. "Healthcare"
    private String location;            // e.g. "Odisha"
}

