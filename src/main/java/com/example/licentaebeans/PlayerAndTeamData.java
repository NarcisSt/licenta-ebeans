package com.example.licentaebeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerAndTeamData {
    private String firstName;
    private String lastName;
    private long shirtNumber;
    private String position;
    private long age;
    private String team;
    private String country;
    private String city;
    private Long points;
}
