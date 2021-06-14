package hu.flow.academy.kappaspringexam.service;

import hu.flow.academy.kappaspringexam.entity.Team;
import hu.flow.academy.kappaspringexam.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Optional<Team> findOne(String id) {
        return teamRepository.findById(id);
    }

    public Team update(Team team, String id) {
        return teamRepository.save(team.toBuilder().id(id).build());
    }

    public Team save(Team team) {
        return teamRepository.save(team);
    }
}
