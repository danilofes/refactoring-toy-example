package org.animals;

public class Dog {

	private int age = 0;

	public int getAge() {
		return this.age;
	}

	public void barkBark() {
		System.out.println("ruff");
		System.out.println("ruff");
		takeABreath();
		System.out.println("ruff");
		System.out.println("ruff");
		System.out.println("ruff");
	}

	public void takeABreath() {
		System.out.println("...");
	}

}
