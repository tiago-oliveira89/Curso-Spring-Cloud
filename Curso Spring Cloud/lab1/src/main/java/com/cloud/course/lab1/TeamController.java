package com.cloud.course.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
       return teamRepository.findAll();
    }

    @GetMapping("/teams/{id}")
    public Optional<Team> getTeam(@PathVariable  Long id) {
        return teamRepository.findById(id);
    }

}
