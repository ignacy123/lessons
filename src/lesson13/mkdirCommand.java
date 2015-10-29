package lesson13;

import java.io.File;

public class mkdirCommand implements CommandStrategy{
	public void execute(SafeReader reader, File currentFile){				
	if (currentFile.isDirectory()) {
		System.out.println("Give name :");
		String line = reader.safelyReadLine();
		File fill = new File(currentFile, line);
		fill.mkdir();

	}
	}
}
