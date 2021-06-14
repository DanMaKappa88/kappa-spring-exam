package hu.flow.academy.kappaspringexam.repository;

import hu.flow.academy.kappaspringexam.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {
}
