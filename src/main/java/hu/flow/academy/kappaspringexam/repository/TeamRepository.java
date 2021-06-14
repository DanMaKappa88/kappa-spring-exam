package hu.flow.academy.kappaspringexam.repository;

import hu.flow.academy.kappaspringexam.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {
}
