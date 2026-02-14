package com.example.sih.model;

import lombok.Data;
import java.util.List;

@Data
public class Candidate {
    private String education;
    private List<String> skills;
    private String sectorInterest;
    private String state;
    private String location;
    private List<String> interests;
}
