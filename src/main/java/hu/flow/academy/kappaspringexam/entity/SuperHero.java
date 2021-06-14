package hu.flow.academy.kappaspringexam.entity;

import hu.flow.academy.kappaspringexam.Model.Universe;
import lombok.Data;

import javax.persistence.Entity;

@Data
public class SuperHero {

    private String id;
    private String name;
    private Universe universe;
    private Team team;
    private Boolean hero;
}
