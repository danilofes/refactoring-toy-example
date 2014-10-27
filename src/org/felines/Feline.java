package org.felines;

public class Feline implements Animal {

	private int age;
	private int name;
	
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
	
	public void meow() {
		System.out.println("meow");
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
	
	

}
