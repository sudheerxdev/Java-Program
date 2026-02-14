package com.example.sih.model;

import lombok.Data;

@Data
public class Internship {
    private String title;
    private String sector;
    private String location;
    private String duration;
    private int matchScore;
}
