package lesson12;

public class FinallyTest {
	public static void main(String[] args) throws Exception {
		e();
	}

	public static void e() throws Exception {
		try {
			System.out.println("InTry");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("InCatch");
			throw e;
		} finally {
			System.out.println("InFinally");
		}

	}
}
