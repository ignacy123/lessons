package lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Filozof implements Runnable {
	private int numer;
	final Paleczka paleczka1;
	final Paleczka paleczka2;
	final Random random;
	public Filozof(int numer, Paleczka paleczka1, Paleczka paleczka2, Random random) {
		this.numer = numer;
		this.paleczka1 = paleczka1;
		this.paleczka2 = paleczka2;
		this.random = random;
	}

	public int getNumer() {
		return numer;
	}

	public void run() {
		sol2();
	}

	private void sol1() {

		while (true) {

			paleczka1.wez();
			paleczka2.wez();
			System.out.println("Filozof nr: " + getNumer() + " zaczyna jesc.");
			doSleep(10);
			paleczka1.odloz();
			paleczka2.odloz();
			System.out.println("Filozof nr: " + getNumer() + " skonczyl jesc.");
			doSleep(10);
		}
	}

	private void sol2() {

		while (true) {
			doSleep(10);
			
			synchronized (paleczka1) {
				
				paleczka1.wezLock(numer);
				synchronized (paleczka2) {
					paleczka2.wezLock(numer);
					System.out.println("Filozof nr: " + getNumer() + " zaczyna jesc.");
					doSleep(10);
					System.out.println("Filozof nr: " + getNumer() + " skonczyl jesc.");
				}
			}
		}
	}

	public void doSleep(int scale) {
		try {
			Thread.sleep(random.nextInt(10) * scale);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
