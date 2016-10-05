package lesson10;

public class Man {
	private Animal animal;
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public String toString() {
		return "I have: "+animal.getName();
	}

}
