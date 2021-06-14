package hu.flow.academy.kappaspringexam.service;

import hu.flow.academy.kappaspringexam.entity.SuperHero;
import hu.flow.academy.kappaspringexam.entity.Team;
import hu.flow.academy.kappaspringexam.repository.SuperHeroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class SuperHeroService {

    private final SuperHeroRepository superHeroRepository;

    public List<SuperHero> findAll() {
        return superHeroRepository.findAll();
    }

    public Optional<SuperHero> findOne(String id) {
        return superHeroRepository.findById(id);
    }

    public SuperHero update(SuperHero superHero, String id) {

        return superHeroRepository.save(superHero.toBuilder().id(id).build());

    }

    public SuperHero save(SuperHero superHero) {
        return superHeroRepository.save(superHero);
    }
}
