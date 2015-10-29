package lesson10;

public class TunedCar extends Car{
	TunedCar(int maxSpeed, int doors, int accleration) {
		super(maxSpeed, doors, accleration);
	}
	int accleration;
	int maxSpeed;
	int doors;

	public void increaseMaxSpeed(){
		maxSpeed *= 1.2;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void decreaseAccleration(){
		accleration *= 0.9; 
	}
	

}
