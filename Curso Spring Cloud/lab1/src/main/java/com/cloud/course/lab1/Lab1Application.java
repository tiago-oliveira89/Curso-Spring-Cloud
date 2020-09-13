package com.cloud.course.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();


		Set<Player> set = new HashSet<>();
		set.add(new Player("Tiago", "Showman"));
		set.add(new Player("Heloisa", "Guard"));
		set.add(new Player("Lucas", "Guard"));

		list.add(new Team("Harlem", "Caruaru", set));
		list.add(new Team("Washington","Generals",null));

		teamRepository.saveAll(list);
	}

}
