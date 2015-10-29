package lesson5;

public class Oobjects {
	public static void main(String[] args) {

		Car car = new Car(0, 0);
		car.slowDown(10);
		car.drive(10);
		System.out.println(car);
		car.acclerate(100);
		car.drive(222);
		car.drive(123);

		System.out.println(car);

		Train train = new Train(3);
		System.out.println(train);
		train.pauseAtStation(0, 10);
		train.move(5);
		System.out.println(train);
		train.pauseAtStation(7, 2);
		train.move(3);
		System.out.println(train);
	
	}

}

class Car {
	int velocity;
	int distance;

	Car(int velocity, int distance) {
		this.velocity = velocity;
		this.distance = distance;
	}

	public void drive(int time) {
		if (time < 0) {
			return;
		}
		distance = velocity * time + distance;

	}

	public void acclerate(int speedChange) {
		if (velocity + speedChange >= 0) {
			velocity = velocity + speedChange;
		}
	}

	public void slowDown(int speedChange) {
		if (velocity - speedChange >= 0) {
			velocity = velocity - speedChange;
		}
	}

	public int getVelocity() {
		return velocity;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "velocity: " + velocity + ", distance: " + distance;
	}
}

class Train {
	int passengers;
	int distance; // ile przystankow
	int prize; // cena za przejechanie jednego przystanku
	int earned; // ile zarobi³

	Train(int prize) {
		this.prize = prize;
	}

	public void pauseAtStation(int passengersOut, int passengersIn) {
		passengers = passengers - passengersOut + passengersIn;
	}

	public void move(int stops) {
		distance = distance + stops;

		earned = earned + passengers * stops * prize;

	}
	

	@Override
	public String toString() {
		return "Train [passengers=" + passengers + ", distance=" + distance
				+ ", prize=" + prize + ", earned=" + earned + "]";
	}

	public int howEarned() {
		return earned;

	}

}
