package com.example.licentaebeans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teams", schema = "licenta", catalog = "postgres")
public class TeamsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "points")
    private Long points;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamsEntity that = (TeamsEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(country, that.country) && Objects.equals(city, that.city) && Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, city, points);
    }
}
