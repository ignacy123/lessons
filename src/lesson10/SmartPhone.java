package lesson10;

public class SmartPhone extends Phone {
	public SmartPhone(String name){
		super(name);
		System.out.println("Creating smartphone...");
	}
	public SmartPhone(){
		
		System.out.println("Creating smartphone...");
	}
	public void openUrl(String url) {
		System.out.println("Opening url: " + url);
	}

	@Override
	protected void useBattery(int used) {
		super.useBattery(used*2);
	}

	@Override
	public void sendSms(String number, String content) {

		super.sendSms(number, content);
		useBattery(1);
	}

	public static void main(String[] args) {
		Phone p1 = new Phone("nokia 3310");
		p1.dial("12432321");
		p1.sendSms("123234", "qwe");
		System.out.println(p1.getBattery());
		SmartPhone p2 = new SmartPhone("iPhone");
		p2.dial("123");
		p2.sendSms("123", "qwe");
		p2.openUrl("www.wp.pl");
		System.out.println(p2.getBattery());
		new SmartPhone();
	}

}
