package lesson17;

import java.util.Random;

public class ThreadTest {
	public static void main(String[] args) {
		Counter c1 = new Counter("c1");
		Counter c2 = new Counter("c2");
		Counter c3 = new Counter("c3");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();
	}
	static class Counter implements Runnable{
		private String name;
		
		public Counter(String name) {
		    this.name = name;
		}
		@Override
		public void run() {
			Random random = new Random(System.nanoTime());
			for(int i = 0; i<= 10; i++){
				System.out.println(name+", "+i);
				try {
					Thread.sleep(random.nextInt(600));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
