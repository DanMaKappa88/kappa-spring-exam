package hu.flow.academy.kappaspringexam.service;

import hu.flow.academy.kappaspringexam.entity.Team;
import hu.flow.academy.kappaspringexam.exeption.ValidateException;
import hu.flow.academy.kappaspringexam.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@Slf4j
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
        if (team.getName() == null || team.getName().equals("")) {
            log.error("Name must have a value ({name})");
            throw new ValidateException("Name  must have a value");
        }
        return teamRepository.save(team.toBuilder().id(id).build());
    }

    public Team save(Team team) {
        return teamRepository.save(team);
    }
}
