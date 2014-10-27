package org.reptile;

public class Reptile extends AnimalMarilho {

	protected int age;
	protected int name;

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

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	

}