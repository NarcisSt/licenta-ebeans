package com.example.licentaebeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamsData {
    private String name;
    private String country;
    private String city;
    private Long points;
}
