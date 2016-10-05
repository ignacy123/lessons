package test;

public class Utils {

	public static void main(String[] args) {
		// System.out.println(args[0]); - odczytanie parametrow wejscia programu.

		int a = Integer.valueOf("1"); // zamiana string na int
		int age = Integer.valueOf(args[0]); // zczytanie wieku z parametru programu do int
		double b = Double.valueOf("2.3"); // zminaa string na double

		double c = Math.sqrt(4); // pierwiastek 2 stopnia
		
		int d = (int)c; // rzutowanie
		
		System.out.println(args.length); // ilosc elementow tablicy.
	}

}
