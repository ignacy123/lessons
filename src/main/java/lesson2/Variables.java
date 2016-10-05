package lesson2;

public class Variables {

	public static void main(String[] args) {
		// typy całkowite
		byte a = 3; // najmniejszy z typow calkowitych
		short b = a = 4;
		int c = 5;
		long d = 6;
		// typy zmiennoprzecinkowe
		float e = 7.0f;
		double f = 8.0;
		c = (int) d; // rzutowanie typu większego na mniejszy (long na int)
		// typy logiczne
		boolean g = true;
		// typy znakowe
		char h = 'r';
		String i = "rt";

		int age = 20;
		String s = "Mam tyle lat: ";
		String ageText = s + age;

		System.out.println("qwerty" + age);

		System.out.println(age + "qwerty");

		// operatory logiczne (zawsze daja boolean)
		boolean b0 = (1 == 2);
		boolean b1 = 1 != 2;
		boolean b2 = 1 > 2;
		boolean b3 = 1 < 2;
		boolean b4 = 1 <= 2;
		boolean b5 = 1 >= 2;
		boolean b6 = !true;
		boolean b7 = !b0;
		boolean b8 = b7 && b6; // "i" true, jesli obydwa sa true
		boolean b9 = b7 || b6; // "lub"  prawda, jesli przynajmnniej jeden jest true
		
		
	}

}
