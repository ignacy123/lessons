package lesson9;

class Coach{

	private String name;


	public String getName() {

		return name;
	}


	void setName(String name) throws Exception{
		String letter = name.substring(0, 1);
		int errorIndex = 0;
		if (letter != letter.toUpperCase()) {
			throw new Exception("Name has to begin with capital letter!");

		}
		if (name.length() <= 3) {
			throw new Exception("Name mustn't be shorter than 3 characters!");

		}
		if (name.length() > 15) {
			throw new Exception("Name mustn't be longer than 15 characters!");

		}

		String errors = "!@#$%^&*()_+{}:<>?1234567890-=[];,./`";
		for (int i = 0; i < errors.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (errors.substring(i, i + 1).equals(name.substring(j, j + 1))) {
					System.out.println("You can't use special characters or sign in a name!");
					errorIndex++;
					break;
				}

			}
 
		}
		if(errorIndex == 0){
		this.name = name;
		System.out.println("Name was changed properly.");
		}
		else{
			System.out.println("Name couldn't be changed because of errors.");
			
		}
	}

}
