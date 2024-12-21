package com.in28minutes.learn_spring_framework;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacMan;
//import com.in28minutes.learn_spring_framework.game.MarioGame;
//import com.in28minutes.learn_spring_framework.game.SuperContra;

public class AppGamingBasic2 {
	
	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);
//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("age"));
//		//System.out.println(context.getBean("person"));
//		//System.out.println(context.getBean("address"));
//		System.out.println(context.getBean("person2Method"));
//		System.out.println(context.getBean("person3Method"));
//		Arrays.stream(context.getBeanDefinitionNames()).
//				 forEach(System.out::println);
//		System.out.println(context.getBean(Address.class));
//		System.out.println(context.getBean(Person.class));
	}
}
