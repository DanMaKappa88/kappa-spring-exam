package hu.flow.academy.kappaspringexam.controller;

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
    public List<Team> findAll() {
        return superHeroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Team> findOne(@PathVariable String id) {
        return superHeroService.findOne(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Team update(@RequestBody Team team, @PathVariable String id) {
        return superHeroService.update(team, id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Team save(@RequestBody Team team) {
        return superHeroService.save(team);
    }

}
