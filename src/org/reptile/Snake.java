package org.reptile;

public class Snake {

	private int age;
	private int name;
	
	private String action;
	
	
	public Snake(int age, int name, int spead, String action) {
		this.age = age;
		this.name = name;
	
		this.action = action;
	}
	public Snake(int age, int name, int spead) {
		
		this.age = age;
		this.name = name;
		
		
	}
	
	public Snake(int age, int name) {
		this.age = age;
		this.name = name;
		
	}
	
	public Snake(int age) {
		this.age = age;
		
	}
	
	public Snake() {
		
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
}
