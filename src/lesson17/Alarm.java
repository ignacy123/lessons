package lesson17;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alarm {
	private static final Pattern alarmPattern = Pattern.compile("alarm ([^ ]+) (\\d+)");

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		while (!line.equals("exit")) {
			if (line.equals("date")) {
				System.out.println(new Date());
			} else if (line.startsWith("alarm")) {
				if (line.matches(alarmPattern.pattern())) {
					Matcher matcher = alarmPattern.matcher(line);
					matcher.find();
					String name = matcher.group(1);
					String time = matcher.group(2);
					double d = Double.valueOf(time);
					int time2 = (int) d;
					System.out.println(name+", "+time);
					Countdown c1 = new Countdown(time2, name);
					Thread t1 = new Thread(c1);
					t1.start();
					line = scanner.nextLine();
					
				} else {
					System.out.println("Invalid format. Usage: alarm name time");
				}
			} else {
				System.out.println("Unknown command");
			}
			if(line.equals("exit")){
				return;
			}
			line = scanner.nextLine();
		}
	}
	
	static class Countdown implements Runnable{
		private int time;
		private String name;
		Countdown(int time, String name){
			this.time = time;
			this.name = name;
		}

		@Override
		public void run() {
			long run = time*1000;
			try {
				Thread.sleep(run);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.err.println("ALARM: "+name);
		}
		
	}
}
