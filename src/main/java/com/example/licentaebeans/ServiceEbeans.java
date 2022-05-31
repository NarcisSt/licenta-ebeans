package com.example.licentaebeans;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
@org.springframework.stereotype.Service
public class ServiceEbeans {
    private RepositoryEbeans repository;

    @Autowired
    public ServiceEbeans(RepositoryEbeans repository) {
        this.repository = repository;
    }

    public void insertTeam(TeamsData team) {
        TeamsEntity teamsEntity = new TeamsEntity();

        teamsEntity.setCity(team.getCity());
        teamsEntity.setCountry(team.getCountry());
        teamsEntity.setName(team.getName());
        teamsEntity.setPoints(team.getPoints());

        repository.insertTeam(teamsEntity);
    }

    public void updateTeam(TeamsData team) {
        TeamsEntity teamsEntity = new TeamsEntity();

        teamsEntity.setCity(team.getCity());
        teamsEntity.setCountry(team.getCountry());
        teamsEntity.setName(team.getName());
        teamsEntity.setPoints(team.getPoints());

        repository.updateTeam(teamsEntity);
    }

    public void deletePlayer(String position, Long age) {

        repository.deletePlayer(position, age);
    }

    public List getPlayerAndTeamByPosition(String position) {
        return repository.getPlayerAndTeamByPosition(position);
    }

    public List<PlayersEntity> getAllPlayers(){
        return repository.getAllPlayers();
    }

    public List<TeamsEntity> getTeamsByPoints(Long points) {
        return repository.getTeamsByPoints(points);
    }
}
