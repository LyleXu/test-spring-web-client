package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Maciej Szarlinski
 */
@Data
@NoArgsConstructor
public class VisitDetails {

    private Integer id = null;

    private Integer petId = null;

    private String date = null;

    private String description = null;
}
