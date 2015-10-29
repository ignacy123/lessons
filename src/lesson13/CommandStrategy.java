package lesson13;

import java.io.File;

public interface CommandStrategy {
	public void execute(SafeReader reader, File currentFile) throws CommandException;
	
}
