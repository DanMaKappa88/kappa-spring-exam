package hu.flow.academy.kappaspringexam.controller;

import hu.flow.academy.kappaspringexam.entity.SuperHero;
import hu.flow.academy.kappaspringexam.entity.Team;
import hu.flow.academy.kappaspringexam.service.SuperHeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/super-hero")
@RequiredArgsConstructor
public class SuperHeroController {

    private final SuperHeroService superHeroService;

    @GetMapping
    public List<SuperHero> findAll() {
        return superHeroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SuperHero> findOne(@PathVariable String id) {
        return superHeroService.findOne(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public SuperHero update(@RequestBody SuperHero superHero, @PathVariable String id) {
        return superHeroService.update(superHero, id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SuperHero save(@RequestBody SuperHero superHero) {
        return superHeroService.save(superHero);
    }

}
