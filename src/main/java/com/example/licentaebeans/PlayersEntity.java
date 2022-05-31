package com.example.licentaebeans;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "players", schema = "licenta", catalog = "postgres")
public class PlayersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "shirt_number")
    private long shirtNumber;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "age")
    private long age;
    @Basic
    @Column(name = "team")
    private String team;
    @Basic
    @Column(name = "name")
    private Integer name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(long shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayersEntity that = (PlayersEntity) o;
        return id == that.id && shirtNumber == that.shirtNumber && age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(position, that.position) && Objects.equals(team, that.team) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, shirtNumber, position, age, team, name);
    }
}
