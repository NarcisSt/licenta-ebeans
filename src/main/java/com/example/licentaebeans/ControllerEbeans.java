package com.example.licentaebeans;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@NoArgsConstructor
@org.springframework.stereotype.Controller
public class ControllerEbeans {
    private ServiceEbeans service;

    @Autowired
    public ControllerEbeans(ServiceEbeans service) {
        this.service = service;
    }

    @PostMapping("/insert-team")
    public ResponseEntity insertTeam(@RequestBody TeamsData team) {
        service.insertTeam(team);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Inserted");
    }

    @PutMapping("/update-team")
    public ResponseEntity updateTeam(@RequestBody TeamsData team) {
        service.updateTeam(team);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Updated");
    }

    @DeleteMapping("/delete-player/{position}/{age}")
    public ResponseEntity deletePlayer(@PathVariable String position, @PathVariable Long age) {
        service.deletePlayer(position, age);

        return ResponseEntity.status(HttpStatus.GONE)
                .body("Deleted");
    }

    @GetMapping("/player-by-position/{position}")
    public ResponseEntity getPlayerAndTeamByPosition(@PathVariable String position) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.getPlayerAndTeamByPosition(position).size());
    }

    @GetMapping("/players")
    public ResponseEntity getAllPlayers() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.getAllPlayers().size());
    }

    @GetMapping("/teams-with-at-least-points/{points}")
    public ResponseEntity getTeamsByPoints(@PathVariable Long points) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.getTeamsByPoints(points).size());
    }
}

