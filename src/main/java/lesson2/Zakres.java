package lesson2;

public class Zakres {
	public static void main(String[] args) {
		byte i = 2;
		int d;
		d = 2;

		while (i > 1) {
			d = i;
			i = (byte) (i + 1);
		}

		System.out.println(d);
		i = 0;
		d = 0;

		while (i <= 0) {
			d = i;
			i = (byte) (i - 1);
		}
		System.out.println(d);
	}

}
