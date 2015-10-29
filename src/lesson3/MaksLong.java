package lesson3;

public class MaksLong {

	public static void main(String[] args) {
		long testLong  = Long.MAX_VALUE+1;
		System.out.println(testLong);
		
		long makslong = 2;
		int i = 0;
		outer: for ( ;; i++) {

			for (int j = 1; j < 10; j++) {

				long l = (long) (j * Math.pow(10, i));
				if (l < 0) {
					break outer;

				}
				makslong = j * (long) Math.pow(10, i);

			}

		}
System.out.println(makslong+","+i);
System.out.println((long)Math.pow(10, i));
		
		
	}
}
