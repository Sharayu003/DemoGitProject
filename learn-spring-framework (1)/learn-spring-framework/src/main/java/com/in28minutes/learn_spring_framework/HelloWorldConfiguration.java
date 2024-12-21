package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String Firstline, String Secondline) {};

record Person(String name, int age) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Sharayu";
	}
	@Bean
	public int  age() {
		return 20;
	}
	
	@Bean
	public Person person2Method() {//Method call
		return new Person(name(),age());
		
	}
	@Bean
	public Person person3Method(String name,int age ) {//Parameter call
		return new Person(name,age);
		
	}
	@Bean
	public Address address() {
		return new Address("Kharadi Bypass","Pune");
	}
	@Bean
	public Address address1() {
		return new Address("mumbai pune road","Pune");
	}
}
