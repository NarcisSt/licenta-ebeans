package com.example.licentaebeans;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Query;
import io.ebean.annotation.Transactional;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@org.springframework.stereotype.Repository
public class RepositoryEbeans {
    EbeanServer server = Ebean.getDefaultServer();

    @Transactional
    public void insertTeam(TeamsEntity team) {
        server.insert(team);
    }


    @Transactional
    public void updateTeam(TeamsEntity team) {
                 Ebean.update(TeamsEntity.class)
                .set("points", team.getPoints())
                .where()
                .eq("name", team.getName())
                .update();
    }


    @Transactional
    public void deletePlayer(String position, Long age) {
        Query<PlayersEntity> query = Ebean.createQuery(PlayersEntity.class);
        query.where().conjunction()
                .gt("age", age)
                .eq("position", position)
                .endJunction();

        List<PlayersEntity> players = query.findList();

        for( PlayersEntity player : players ) {
            Ebean.delete(player);
        }
    }

    public List getPlayerAndTeamByPosition(String position) {

        String queryJoin = "SELECT p.*, t.country, t.city, t.points FROM licenta.players p INNER JOIN licenta.teams t" +
                " ON p.team = t.name WHERE p.position = :position and p.team LIKE '%United';";

        List<PlayersEntity> players;

            players = Ebean.findNative(PlayersEntity.class, queryJoin)
                    .setParameter("position", position)
                    .findList();

            return players;
    }

    public List<PlayersEntity> getAllPlayers() {
        List<PlayersEntity> players;

        players = Ebean.find(PlayersEntity.class)
                .orderBy("id")
                .findList();

        return players;
    }

    public List<TeamsEntity> getTeamsByPoints(Long points) {

        List<TeamsEntity> teams;

        teams = Ebean.find(TeamsEntity.class)
                .where()
                .gt("points", points)
                .findList();

        return teams;
    }
}
