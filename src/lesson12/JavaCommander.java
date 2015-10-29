package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCommander {
	private File file;
	private BufferedReader reader;

	public JavaCommander(File file) {
		this.file = file;
	}

	public void printFile() {
		System.out.println(file.getAbsolutePath() + " " + (file.isDirectory() ? "dir" : "file"));
		if (file.isDirectory()) {
			System.out.println("0 ..");
			File[] files = file.listFiles();

			for (int n = 0; n < files.length; n++) {
				File childFile = files[n];
				System.out.println((n + 1) + " " + childFile.getName()
						+ (childFile.isDirectory() ? " dir" : " file"));

			}
		} else {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				String line = reader.readLine();
				while (line != null) {
					if (line.equals("exit")) {
						break;
					}

					System.out.println(">> " + line);
					line = reader.readLine();
				}
			} catch (FileNotFoundException e) {
				System.err.println("File not found" + file.getAbsolutePath());
			} catch (IOException e) {
				System.err.println("Couldn't read file!" + e.getMessage());
			} finally {
				try {
					if (reader != null) {
						reader.close();
					}
				} catch (IOException e) {

				}
			}
		}
	}

	public void makeChoice(int choice) {
		if (choice == 0) {
			file = file.getParentFile();
		} else {
			File childFile = file.listFiles()[choice - 1];
			file = childFile;
		}
	}

	public void loop() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			while (line != null) {
				if (line.equals("exit")) {
					break;
				} else if (line.equals("touch")) {
					if (file.isDirectory()) {
						System.out.println("Give name :");
						line = reader.readLine();
						File fill = new File(file, line);
						fill.createNewFile();

					}
				} else if (line.equals("touchdir")) {
					if (file.isDirectory()) {
						System.out.println("Give name :");
						line = reader.readLine();
						File fill = new File(file, line);
						fill.mkdir();

					}
				} else if (line.equals("edit")) {
					edit(line);
				} else {
					int choice = Integer.valueOf(line);
					makeChoice(choice);

					// new File(file, "")
					// 0ile.createNewFile()
					// file.mkdir();
				}
				printFile();
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private String safelyReadLine(){
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	private void edit(String line) {
		if (file.isDirectory() == true) {
			System.out.println("Choose file to edit.");
			printFile();
			line = safelyReadLine();
			StringBuilder builder = new StringBuilder();
			while(!line.equals(">>>")){
				builder.append(line);
				line = safelyReadLine();
			}
			WriteFIle writer = new WriteFIle();
			
			String content = builder.toString();
			int choice = Integer.valueOf(line);
			makeChoice(choice);
		} else {
			System.out.println("You can't edit directories");
		}
	}
private void writeToFile(File file, String content){
	
}
	public static void main(String[] args) {
		File file = new File(args[0]);
		JavaCommander cmd = new JavaCommander(file);
		cmd.printFile();
		cmd.loop();
	}
}
