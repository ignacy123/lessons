package lesson11;

abstract public class AbstractAnimal implements Animal {
	protected String name;

	public AbstractAnimal(String name) throws AnimalCreationException {
		if(name.length()<2){
			throw new AnimalCreationException("Name must be at least 2 characters!");
		}
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public final String getName() {
		return name;
	}

}
