package lesson3;

public class MethodTest {
	public static void main(String[] args) {
		
		
		
		printIsAdult("Adam", isAdult(0));
		printIsAdult("Adam", isAdult(251));
		printIsAdult("Adam", isAdult(23));
		printIsAdult("Adam", isAdult(10));
	}

	public static boolean isAdult(int age) {
		if (age >= 18) {
			return true;

		}
		return false;
	}

	public static void printIsAdult(String name, boolean isAdult) {
		if (isAdult) {
			System.out.println(name + " jest doros³y. ");
		} else {
			System.out.println(name + " nie jest doros³y. ");
		}

	}
	// public static typ_zwracany nazwa(Typ Nazwa, Typ Nazwa...){}
	// void specjalny typ, który nic nie zwraca
	// return przerywa natychmiast dzia³anie metody i opcjonalnie zwraca wartoœæ
}
