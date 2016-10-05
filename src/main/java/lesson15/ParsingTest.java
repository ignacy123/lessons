package lesson15;

import java.util.Scanner;

public class ParsingTest {
	public static void main(String[] args) {
		// www(\.[0-9a-z-]+)+\.(pl|com|gov)
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.equals("exit")) {
				break;
			}
			if (line.matches("(www\\.)?([0-9a-z-]+\\.)+(pl|com|gov)")) {
				System.out.println(line + " is a domain.");
			} else {
				System.out.println(line + " is not a domain.");
			}
		}
		sc.close();

	}
}
