package lesson10;

public class Car {
	int maxSpeed;
	int doors; // 3/5
	int accleration; //ilosc sekund potrzebna do uzyskania predkosci 100km/h
	Car(int maxSpeed, int doors, int accleration){
		this.maxSpeed = maxSpeed;
		this.accleration = accleration;
		if(doors == 3 || doors == 5){
			this.doors = doors;
		}
		else{
			System.out.println("Car can have only 3 or 5 doors");
		}
	}
	protected int getmaxSpeed() {
		return maxSpeed;
	}
	protected int getDoors() {
		return doors;
	}
	protected int getAccleration() {
		return accleration;
	}
	

}
