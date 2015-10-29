package lesson11;

public class Dog extends AbstractAnimal implements Animal, Pet{

	public Dog(String name) throws AnimalCreationException {
		super(name);
	}

	@Override
	public Species getSpecies() {
		return Species.DOG;
	}

	public static void main(String[] args) throws AnimalCreationException {
		Animal dog = new Dog("Burek");
		System.out.println(dog.getName());
	}
	public void stroke(){
		System.out.println("You're stroking your dog. Hau, Hau!");
	}
	public void goForAWalk(){
		System.out.println("You're taking your dog for a walk.");
	}
}
