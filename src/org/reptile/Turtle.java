package org.reptile;

public class Turtle extends Reptile {

	public Turtle(int age, int name, int spead, String action) {
		this.age = age;
		this.name = name;
		this.spead = spead;
		this.action = action;
	}
	public Turtle(int age, int name, int spead) {
		
		this.age = age;
		this.name = name;
		this.spead = spead;
		
	}
	
	public Turtle(int age, int name) {
		this.age = age;
		this.name = name;
		
	}
	
	public Turtle(int age) {
		this.age = age;
		
	}
	
	public Turtle() {
	}


	

}
