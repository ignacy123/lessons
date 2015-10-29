package lesson10;

public class Dog extends Mammal{
	@Override
	public String getName() {
		return super.getName()+" => Dog";
	}
	
	public void bark(){
		System.out.println("Hau Hau!");
	}
}
