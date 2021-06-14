package hu.flow.academy.kappaspringexam.entity;

import hu.flow.academy.kappaspringexam.model.Kind;
import hu.flow.academy.kappaspringexam.model.Universe;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Team {
    @Id
    private String id;
    private String name;
    private Universe universe;
    private Kind kind;
}
