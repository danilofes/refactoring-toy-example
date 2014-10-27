package org.reptile;

public class TurtleMarinha extends Reptile {

	public TurtleMarinha(int age, int name, int spead, String action) {
		this.age = age;
		this.name = name;
		this.spead = spead;
		this.action = action;
	}
	public TurtleMarinha(int age, int name, int spead) {
		
		this.age = age;
		this.name = name;
		this.spead = spead;
		
	}
	
	public TurtleMarinha(int age, int name) {
		this.age = age;
		this.name = name;
		
	}
	
	public TurtleMarinha(int age) {
		this.age = age;
		
	}
	
	public TurtleMarinha() {
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	

}
