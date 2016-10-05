package lesson19;

import java.util.Random;

public class Konsument implements Runnable{
	private Pudelko pudelko;


	public Konsument(Pudelko pudelko) {
		this.pudelko = pudelko;
	}
	@Override
	public void run() {
		Random random = new Random(System.currentTimeMillis());
		
		for(int i = 0;i<=15;i++){
			int ile = random.nextInt(10);
			pudelko.wez(ile);

			try {
				Thread.sleep(random.nextInt(10)*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
