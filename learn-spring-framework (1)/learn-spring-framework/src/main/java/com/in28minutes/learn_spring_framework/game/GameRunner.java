package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
	GameConsole game;
	
		public GameRunner(GameConsole game) {
			this.game = game;
		}
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Running class" + game);
			game.up();
			game.down();
			game.left();
			game.right();
		}
		
}
