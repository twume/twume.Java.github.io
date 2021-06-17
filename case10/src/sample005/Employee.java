package sample005;

import java.io.Serializable;

class Employee implements Serializable {
	String name;
	int age;
	public static final long serialUID = 222222222L;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return this.name + " " + this.age;
	}
}
