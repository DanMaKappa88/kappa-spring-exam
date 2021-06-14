package hu.flow.academy.kappaspringexam.service;

import hu.flow.academy.kappaspringexam.entity.SuperHero;
import hu.flow.academy.kappaspringexam.entity.Team;
import hu.flow.academy.kappaspringexam.repository.SuperHeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SuperHeroService {

    private final SuperHeroRepository superHeroRepository;

    public List<SuperHero> findAll() {
        return superHeroRepository.findAll();
    }

    public Optional<SuperHero> findOne(String id) {
    }

    public Team update(SuperHero superHero, String id) {
    }

    public Team save(SuperHero superHero) {
    }
}
