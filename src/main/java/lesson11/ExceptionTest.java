package lesson11;

public class ExceptionTest {
	public static void dangerousMethod(int a, int b) throws Exception {
		System.out.println("I'm about to do something dangerous!");
		System.out.println(a + "/" + b + "=" + (a / b));
		throw new Exception("asdf");
	}

	public static void main(String[] args) {

		try {
			dangerousMethod(1, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			dangerousMethod(2, 4);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
