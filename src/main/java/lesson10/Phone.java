package lesson10;

public class Phone {
	private int battery = 10;
	private String name;

	public Phone() {
		System.out.println("Creating phone...");
		this.name = "Noname";
	}
	public Phone(String name) {
		System.out.println("Creating phone...");
		this.name = name;
	}

	protected void useBattery(int used) {
		battery -= used;
	}

	public void dial(String number) {
		System.out.println(number);
		useBattery(5);
	}

	public void sendSms(String number, String content) {
		System.out.println("Sending sms to: " + number + "with content"
				+ content);
		useBattery(2);
	}

	public int getBattery() {
		return battery;
	}
}
