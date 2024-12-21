package com.in28minutes.learn_spring_framework.game;

public class PacMan implements GameConsole  {
	public void up() {
		System.out.println("Go up");
	}
	public void down() {
		System.out.println("Go in Hole");
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("Move Forward");
	}
}
