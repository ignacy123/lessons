package lesson12;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		String path = args[0];
		File file = new File(path);
		String fileType = file.isDirectory() ? "directory" : "file";
		System.out.println(file.getAbsolutePath() + " " + fileType);
		if (file.isDirectory()) {
			file.listFiles();
			for (File childFile : file.listFiles()) {
				System.out.println(childFile.getName() + (childFile.isDirectory() ? " dir" : " file"));
			}
		}

	}

}
