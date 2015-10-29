package lesson4;

public class BackString {

	public static void main(String[] args) {
		String text = args[0];
		int i = text.length();
		String help = "";
		char help2 = 'a';

		while (i > 0) {
			help2 = text.charAt(i - 1);
			help = help + help2;

			i = i - 1;

		}

		System.out.println(help);

		for (int j = text.length() - 1; j >= 0; j--) {
			System.out.print(text.charAt(j));

		}

	}

}
