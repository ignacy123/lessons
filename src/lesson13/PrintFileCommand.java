package lesson13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFileCommand implements CommandStrategy {

	public void execute(SafeReader reader, File currentFile) {
		System.out.println(currentFile.getAbsolutePath() + " "
				+ (currentFile.isDirectory() ? "dir" : "file"));
		if (currentFile.isDirectory()) {
			System.out.println("0 ..");
			File[] files = currentFile.listFiles();

			for (int n = 0; n < files.length; n++) {
				File childFile = files[n];
				System.out.println((n + 1) + " " + childFile.getName()
						+ (childFile.isDirectory() ? " dir" : " file"));

			}
		} else {

			String line = reader.safelyReadLine();
			while (line != null) {
				if (line.equals("exit")) {
					break;
				}

				System.out.println(">> " + line);
				line = reader.safelyReadLine();
			}

		}
	}

}
