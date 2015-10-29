package lesson13;

import java.io.File;
import java.io.IOException;

public class TouchCommand implements CommandStrategy {

	@Override
	public void execute(SafeReader reader, File currentFile) throws CommandException {
		if (currentFile.isDirectory()) {
		
			System.out.println("Give name :");
			String line = reader.safelyReadLine();
			File fill = new File(currentFile, line);
			try {
				fill.createNewFile();
			} catch (IOException e) {
				CommandException exc = new CommandException("File couldn't be created.", e);
				throw exc;
			}

		}
		else{
			throw new CommandException("File can be only created in directory.");
		}
	}



}
