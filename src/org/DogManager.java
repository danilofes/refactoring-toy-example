package org;
import org.animals.Dog;


public class DogManager {

	private Dog dog;
	public int magicNumber = 17;
	
	public DogManager(Dog aDog) {
		this.dog = aDog;
	}
	
	public void doStuff() {
		this.dog.barkBark(this);
		
		int age = dog.getAge();
		int sum = 0;
		for (int i = 0; i < age; i++) {
			System.out.println(i);
			sum += i;
		}
		sum -= magicNumber;
		dog.takeABreath();
	}

}
