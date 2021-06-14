package hu.flow.academy.kappaspringexam.controller;


import hu.flow.academy.kappaspringexam.entity.Team;
import hu.flow.academy.kappaspringexam.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping
    public List<Team> findAll() {
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Team> findOne(@PathVariable String id) {
        return teamService.findOne(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Team update(@RequestBody Team team, @PathVariable String id) {
        return teamService.update(team, id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Team save(@RequestBody Team team) {
        return teamService.save(team);
    }
}
