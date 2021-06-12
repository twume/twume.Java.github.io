package sample006;

public class Sword {
	String name;

	Sword(String name) {
		this.name = name;
	}

	Sword() {
		this("test");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
