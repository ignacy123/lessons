package lesson11;

import java.util.ArrayList;
import java.util.List;

public class AnimalHostel {
	private List<Animal> animals = new ArrayList<Animal>();

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void printAnimals() {
		for (Animal a : animals) {
			System.out.println(a.getName());
		}
	}

	public void feedAnimals() {
		for (Animal a : animals) {
			feedAnimal(a);
		}
	}

	private void feedAnimal(Animal a) {
		switch (a.getSpecies()) {
		case CAT:
			System.out.println("Feeding cat: " + a.getName() + " with milk.");
			break;
		case DOG:
			System.out
					.println("Feeding dog: " + a.getName() + " with sausage.");
			break;
		case LION:
			System.out.println("Feeding lion: " + a.getName() + " with zebra.");
			break;
		default:
			break;

		}
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		AnimalHostel hostel = new AnimalHostel();
		try {
			Animal a = new Cat("T");
			hostel.addAnimal(a);
		} catch (AnimalCreationException e) {
		}
		try {
			Animal d = new Dog("Reksio");
			hostel.addAnimal(d);
		} catch (AnimalCreationException e) {
		}

		hostel.feedAnimals();
	}
}
