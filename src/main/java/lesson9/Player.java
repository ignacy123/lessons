package lesson9;

public class Player {
	private int age = 0;
	private String name = "";
	private String position = "";

	Player(String name, String position, int age) {
		this.name = name;
		if (age > 100) {
			System.out.println("Age must be lower than 100.");
		} else {
			if (age < 5) {
				System.out.println("Age must be bigger than 5.");
			}
			else{
				this.age = age;
			}
		}
		switch (position) {
		case "goalkepper":
			this.position = position;
			break;
		case "defender":
			this.position = position;
			break;
		case "midfielder":
			this.position = position;
			break;
		case "attacker":
			this.position = position;
			break;
		default:
			System.out.println("Position doesn't exist");
		}

	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPosition() {
		return position;
	}
}
