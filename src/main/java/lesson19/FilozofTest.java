package lesson19;

import java.util.Random;

public class FilozofTest {
	public static void main(String[] args) {
		Paleczka paleczka1 = new Paleczka(1);
		Paleczka paleczka2 = new Paleczka(2);
		Paleczka paleczka3 = new Paleczka(3);
		Paleczka paleczka4 = new Paleczka(4);
		Paleczka paleczka5 = new Paleczka(5);
		Random random1 = new Random(System.currentTimeMillis());
		Filozof filozof1 = new Filozof(1, paleczka1, paleczka2, random1);
		Filozof filozof2 = new Filozof(2, paleczka2, paleczka3, new Random(random1.nextLong()));
		Filozof filozof3 = new Filozof(3, paleczka3, paleczka4, new Random(random1.nextLong()));
		Filozof filozof4 = new Filozof(4, paleczka4, paleczka5, new Random(random1.nextLong()));
		Filozof filozof5 = new Filozof(5, paleczka5, paleczka1, new Random(random1.nextLong()));
		Thread t1 = new Thread(filozof1);
		t1.setName("Filozof1");
		Thread t2 = new Thread(filozof2);
		t2.setName("Filozof2");
		Thread t3 = new Thread(filozof3);
		t3.setName("Filozof3");
		Thread t4 = new Thread(filozof4);
		t4.setName("Filozof4");
		Thread t5 = new Thread(filozof5);
		t5.setName("Filozof5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
