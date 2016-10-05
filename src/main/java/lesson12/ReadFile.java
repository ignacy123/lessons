package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	public static void main(String[] args) {
		String path = args[0];
		File file = new File(path);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(
					file)));
			try {
				String line = reader.readLine();
				while (line != null) {
					if (line.equals("exit")) {
						break;
					}

					System.out.println(">> " + line);
					line = reader.readLine();

				}
			} catch (IOException ex) {

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(reader != null){
					reader.close();
				}
			} catch (IOException e) {
				
			}
		}
	}

}
