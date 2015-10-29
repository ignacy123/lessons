package lesson6;

import java.awt.Toolkit;

public class Dependencies {
	public static void main(String[] args) {
		Display screen = new Display();
		Speaker speaker = new Speaker();

		Keyboard keyboard = new Keyboard();
		Phone phone = new Phone(speaker, screen, keyboard, "9");

		keyboard.buttonWasPressed('5');
		keyboard.buttonWasPressed('5');
		keyboard.buttonWasPressed('6');
		keyboard.dialWasPressed();
		

	}

}

class Phone {
	String text = "";
	Speaker speaker;
	Display screen;
	Keyboard keyboard;
	String number;
	Exchange exchange;

	Phone(Speaker speaker, Display screen, Keyboard keyboard, String number) {
		this.speaker = speaker;
		this.screen = screen;
		this.keyboard = keyboard;
		this.number = number;
		keyboard.setPhone(this);

	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public String getText() {
		return text;
	}

	public void button(char button) {

		text = text + button;
		speaker.beep();
		screen.printString(text);

	}

	public void makeCall(String calledNumber) {
		exchange.call(this, calledNumber);
		speaker.beep();
	}

	public void receiveCall(String callingNumber) {
		screen.printString("You're receiving a call! Number: " + callingNumber);
		speaker.beep();
	}

	public String getNumber() {
		return number;
	}

}

class Keyboard {
	Phone phone;

	Keyboard() {

	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void buttonWasPressed(char button) {
		Character.isDigit(button);

		if (Character.isDigit(button)) {
			phone.button(button);
		}

	}

	public void dialWasPressed() {
		phone.makeCall(phone.getText());
	}

}

class Speaker {
	public void beep() {
		Toolkit.getDefaultToolkit().beep();
		System.out.println("beep");
	}
}

class Display {
	public void printString(String text) {
		System.out.println(text.toUpperCase());
	}
}

class Exchange {
	Speaker speaker1;// = new Speaker();
	Display screen1;
	Keyboard keyboard1;
	Speaker speaker2;
	Display screen2;
	Keyboard keyboard2;
	Speaker speaker3;
	Display screen3;
	Keyboard keyboard3;
	Speaker speaker4;
	Display screen4;
	Keyboard keyboard4;
	Speaker speaker5;
	Display screen5;
	Keyboard keyboard5;
	Phone phone1;
	Phone phone2;
	Phone phone3;
	Phone phone4;
	Phone phone5;

	Exchange() {
		phone1 = new Phone(speaker1, screen1, keyboard1, "66666666");
		phone1.setExchange(this);
		phone5 = new Phone(speaker5, screen5, keyboard5, "77777777");
		phone5.setExchange(this);
		phone3 = new Phone(speaker3, screen3, keyboard3, "88888888");
		phone3.setExchange(this);
		phone4 = new Phone(speaker4, screen4, keyboard4, "99999999");
		phone4.setExchange(this);
		phone5 = new Phone(speaker5, screen5, keyboard5, "00000000");
		phone5.setExchange(this);
	}

	public void call(Phone callingPhone, String calledNumber) {


		switch (calledNumber) {
		case "66666666":
			phone1.receiveCall(callingPhone.getNumber());
			break;
		case "77777777":
			phone2.receiveCall(callingPhone.getNumber());
			break;
		case "88888888":
			phone3.receiveCall(callingPhone.getNumber());
			break;
		case "99999999":
			phone4.receiveCall(callingPhone.getNumber());
			break;
		case "00000000":
			phone5.receiveCall(callingPhone.getNumber());
			break;

		}
	}

}
