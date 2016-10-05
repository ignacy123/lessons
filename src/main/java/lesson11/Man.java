package lesson11;

public class Man {
	private final String name;
	private final int age;

	public Man(String name, int age) throws ManCreationException {
		if(name.length()<2){
			throw new ManCreationException("Name must be longer than 2 characters.");
		}
		this.name = name;
		if(age<0){
			throw new ManCreationException("Age can't be lower than 0.");
		}
		this.age = age;
	}
	public void playWithPet(Pet pet){
		pet.stroke();
		pet.goForAWalk();
		pet.stroke();
		System.out.println("You've just played with your pet.");
		
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		try {
			Man man = new Man("q", -1);
			System.out.println(man);
		} catch (ManCreationException e) {
			e.printStackTrace();
		}
		Dog dog = null;
		try {
			dog = new Dog("Burek");
		} catch (AnimalCreationException e1) {
			e1.printStackTrace();
		}
		Man man;
		try {
			man = new Man("qwerty", 8);
			man.playWithPet(dog);
		} catch (ManCreationException e) {
			e.printStackTrace();
		}
		
	}

}
