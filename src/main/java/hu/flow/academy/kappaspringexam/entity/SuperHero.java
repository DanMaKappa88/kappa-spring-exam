package hu.flow.academy.kappaspringexam.entity;

import hu.flow.academy.kappaspringexam.model.Universe;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class SuperHero {

    @Id
    private String id;
    private String name;
    private Universe universe;
    private Team team;
    private Boolean hero;
}
