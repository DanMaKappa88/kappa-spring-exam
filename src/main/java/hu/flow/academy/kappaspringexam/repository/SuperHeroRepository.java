package hu.flow.academy.kappaspringexam.repository;

import hu.flow.academy.kappaspringexam.entity.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperHeroRepository extends JpaRepository<SuperHero, String> {
}
