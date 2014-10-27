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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TurtleMarinha other = (TurtleMarinha) obj;
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
