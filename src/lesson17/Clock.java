package lesson17;

import java.util.Date;

public class Clock {
	public static void main(String[] args) throws Exception {
		while(true){
			System.out.println(new Date());
			Thread.sleep(1000);
		}
	}
}
