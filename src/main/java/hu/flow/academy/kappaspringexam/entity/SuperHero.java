package hu.flow.academy.kappaspringexam.entity;

import hu.flow.academy.kappaspringexam.model.Universe;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class SuperHero {


    @Id
    private String id;
    private String name;
    private Universe universe;
    private Team team;
    private Boolean hero;
}
