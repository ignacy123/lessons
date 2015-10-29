package lesson20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest {
	public static void main(String[] args) {
		try {
			ServerSocket serverScoket = new ServerSocket(12345);
			Socket clientSocket = serverScoket.accept();
			Scanner sc = new Scanner(clientSocket.getInputStream());
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
			sc.close();
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
