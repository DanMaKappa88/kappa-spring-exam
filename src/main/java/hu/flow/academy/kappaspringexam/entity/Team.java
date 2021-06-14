package hu.flow.academy.kappaspringexam.entity;

import hu.flow.academy.kappaspringexam.Model.Kind;
import hu.flow.academy.kappaspringexam.Model.Universe;
import lombok.Data;

@Data
public class Team {
    private String id;
    private String name;
    private Universe universe;
    private Kind kind;
}
