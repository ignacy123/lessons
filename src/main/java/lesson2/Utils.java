package lesson2;

public class Utils {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {

		case 0:
			System.out.println("a = 0");
			break;

		case 5:
			System.out.println("a = 5");
			break;

		default:
			System.out.println("nie znam wartosci a");

		}

		for (int i = 0; i < 100; i = i + 1) {
			if (i % 10 == 0) {
				continue;
			}
			System.out.println(i);
			if (i == 57) {
				break;
			}
		}

		do{
			
		}while (a > 0);
	
	String str1 = "asdf";
	int index = str1.indexOf("sd"); //index pierwszego pojawnienia sie lancucha znakow sd
	// f2 inforamcje
	
	}
	

}
