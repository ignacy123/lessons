package lesson4;

public class StringOperations {

	public static void main(String[] args) {

		String s = "Ala ma kota.";
		System.out.println(s.length());

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");

		}

		System.out.println(s.charAt(s.length() - 1));

		String sub = s.substring(0, 5);
		System.out.println(sub);
		System.out.println(s);
		System.out.println(s.indexOf("kot"));
		System.out.println(s.indexOf("ert"));
		String search = "ma";
		System.out.println(s.substring(s.indexOf(search), s.length()));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		char c  = 'a';
		String cs = c+"";
		
	}

}
