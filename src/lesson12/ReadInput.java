package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			while(line != null){
				if(line.equals("exit")){
					break;
				}
				System.out.println(">> "+line);
				line = reader.readLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
