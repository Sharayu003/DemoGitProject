package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameConsole;
import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacMan;

@Configuration
public class GameConfiguration {
	
	@Bean
	public GameConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
