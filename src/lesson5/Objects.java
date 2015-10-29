
	package lesson5;

	public class Objects {
		public static void main(String[] args) {
			int x = 5;
			Man man = new Man();
			System.out.println(man.firstName + "," + man.height + ","
					+ man.lastName);
			man.height = 190;
			man.firstName = "Adam";
			man.lastName = "Kowalski";
			man.sayHello();
			man.grow(15);
			System.out.println(man.getHeight());
			System.out.println(man);
			man = new Man("Jan", "Nowak", 1970);
			System.out.println(man);
			
		}
	}

	class Man {
		int height;
		String firstName;
		String lastName;
		int age;

		Man() {

			System.out.println("default constructor with no parameters");

		}

		Man(String firstName, String lastName, int yearOfBirth) {

			this.firstName = firstName;
			this.lastName = lastName;
			age = 2014 - yearOfBirth;

		}

		void sayHello() {

			System.out.println("Hi, I am " + getFullName());
		}

		String getFullName() {

			return firstName + " " + lastName;

		}

		public int getHeight() {
			return height;
		}

		void grow(int diff) {
			height = height + diff;

		}

		@Override
		public String toString() {

			return firstName + " " + lastName + ",height: " + height + ", age: "
					+ age;
		}
	}

