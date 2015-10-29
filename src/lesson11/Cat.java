package lesson11;

public class Cat extends AbstractAnimal implements Animal, Pet{

	public Cat(String name) throws AnimalCreationException {
		super(name);
	}

	@Override
	public Species getSpecies() {
		return Species.CAT;
	}
	public void stroke(){
		System.out.println("You're stroking your cat.Miau, miau...");
	}
	public void goForAWalk(){
		System.out.println("You're taking your cat for a walk.");
	}

}
