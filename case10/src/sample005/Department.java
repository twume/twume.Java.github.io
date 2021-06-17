package sample005;

import java.io.Serializable;

class Department implements Serializable {
	String name;
	Employee leader;
	public static final long serialUID = 1111111111L;

	public Department(String name, Employee e) {
		this.name = name;
		this.leader = e;
	}

	public Department() {

	}

	public String toString() {
		return this.name + " " + this.leader;
	}
}
