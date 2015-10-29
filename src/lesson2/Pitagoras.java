package lesson2;

public class Pitagoras {

	public static void main(String[] args) {

		double a = Double.valueOf(args[0]);
		double b = Double.valueOf(args[1]);
		double c;

		c = Math.sqrt(a * a + b * b);
		System.out.println("dla a = " + a + " i b = " + b + ", c = " + c);

	}
}
