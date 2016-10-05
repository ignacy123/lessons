package lesson3;

public class ZakresLong {

	public static void main(String[] args) {
		long t = 1;
		long a = 10;
		long b = 2;
		

		while (b > 0) {

			b = (long) Math.pow(a, t);
			System.out.println(b);
			t = t + 1;

		}

		t = t - 1;

		long p = (long) Math.pow(a, t);
		System.out.println(a);
		System.out.println(t);
		System.out.println(p);

		long step = p;

		while (step > 9) {
			t = 0;
			while (b > 0) {

				t = t + 1;
				b = b + p;
			}

			b = p * t + b;
			step = step / 10;
		}

		System.out.println(b);

	}
}
