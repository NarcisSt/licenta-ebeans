package com.example.licentaebeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayersData {
    private String firstName;
    private String lastName;
    private long shirtNumber;
    private String position;
    private long age;
    private String team;
}
