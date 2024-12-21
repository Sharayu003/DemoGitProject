package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameConsole;
import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacMan;

public class AppGamingBasic3 {

	public static void main(String[] args) {
		
		try(var context = 	new AnnotationConfigApplicationContext
				(GameConfiguration.class)){
			
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		// TODO Auto-generated method stub
	
	
	

	}

}
