package lesson10;

public class AnimalsTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.getName());
		Animal d = new Dog();
		System.out.println(d.getName());
		Man man = new Man();
		man.setAnimal(a);
		System.out.println(man);
		man.setAnimal(d);
		System.out.println(man);
	}
}
