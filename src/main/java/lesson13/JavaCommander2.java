package lesson13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class JavaCommander2 implements SafeReader {
	private File file;
	private BufferedReader reader;
	private Map<String, CommandStrategy> availableCommands = new HashMap<String, CommandStrategy>();

	public JavaCommander2(File file) {
		this.file = file;
	}

	public void addCommand(String command, CommandStrategy strategy) {
		availableCommands.put(command, strategy);
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
		PrintFileCommand printCommand = new PrintFileCommand();
		reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			while (line != null) {
				if (line.equals("exit")) {
					break;
				} else {
					if (availableCommands.containsKey(line)) {
						try {
							availableCommands.get(line).execute(this, file);
						} catch (CommandException e) {
							System.out.println(e.getMessage());
							
						}
					} else {
						int choice = Integer.valueOf(line);
						makeChoice(choice);
					}
					// new File(file, "")
					// 0ile.createNewFile()
					// file.mkdir();
				}
				printCommand.execute(this, file);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String safelyReadLine() {
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
			while (!line.equals(">>>")) {
				builder.append(line);

				line = safelyReadLine();
			}
			String content = builder.toString();
			int choice = Integer.valueOf(line);
			makeChoice(choice);
		} else {
			System.out.println("You can't edit directories");
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		JavaCommander2 cmd = new JavaCommander2(file);

		cmd.addCommand("touch", new TouchCommand());
		cmd.addCommand("edit", new WriteToFileCommand());
		cmd.printFile();
		cmd.loop();
	}
}
