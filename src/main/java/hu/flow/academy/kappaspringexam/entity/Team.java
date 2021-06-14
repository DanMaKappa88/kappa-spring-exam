package hu.flow.academy.kappaspringexam.entity;

import hu.flow.academy.kappaspringexam.model.Kind;
import hu.flow.academy.kappaspringexam.model.Universe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    private String id;
    private String name;
    private Universe universe;
    private Kind kind;
}
