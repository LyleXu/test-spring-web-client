package com.example.demo.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maciej Szarlinski
 */
@Data
public class PetDetails {

    private int id;

    private String name;

    private String birthDate;

    private PetType type;

    private final List<VisitDetails> visits = new ArrayList<>();

}
