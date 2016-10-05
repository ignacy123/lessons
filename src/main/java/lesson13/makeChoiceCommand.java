package lesson13;

import java.io.File;

public class makeChoiceCommand{

	public void execute(int choice, File file){
		if (choice == 0) {
			file = file.getParentFile();
		} else {
			File childFile = file.listFiles()[choice - 1];
			file = childFile;
		}
	}

}
