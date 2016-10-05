package lesson24.car;

/**
 * Created by ignacy on 28.04.16.
 */
public class Passenger {
    public void takeARide(Car car){
        car.drive();
    }

    public static void main(String[] args) {
        Passenger p = new Passenger();
        Car car = new Porsche();
        Car car2 = new Fiat();
        p.takeARide(car);
    }
}
