package lesson13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class WriteToFileCommand implements CommandStrategy{

	
	public void execute(SafeReader reader, File currentFile) throws CommandException {
		
		BufferedWriter writer = null;
		System.out.println("Choose file to edit");
		makeChoiceCommand mkch = new makeChoiceCommand();
		PrintFileCommand printer = new PrintFileCommand();
		printer.execute(reader, currentFile);
		String line = reader.safelyReadLine();
		int choice = Integer.valueOf(line);
		mkch.execute(choice, currentFile);
		line = reader.safelyReadLine();
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(currentFile)));
			try {
				if(line.equals(">>>")){
					writer.close();
				}
				writer.write(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
