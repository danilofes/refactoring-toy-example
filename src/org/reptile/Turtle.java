package org.reptile;

public class Turtle {

	private int age;
	private int name;
	private int spead;
	private String action;
	
	
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
	public int getSpead() {
		return spead;
	}
	public void setSpead(int spead) {
		this.spead = spead;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
	@Override
	public String toString() {
		return "Turtle [age=" + age + ", name=" + name + ", spead=" + spead
				+ ", action=" + action + ", getAge()=" + getAge()
				+ ", getName()=" + getName() + ", getSpead()=" + getSpead()
				+ ", getAction()=" + getAction() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + age;
		result = prime * result + name;
		result = prime * result + spead;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turtle other = (Turtle) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (age != other.age)
			return false;
		if (name != other.name)
			return false;
		if (spead != other.spead)
			return false;
		return true;
	}


	

}
