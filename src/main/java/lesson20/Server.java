package lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocketCopy = null;
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			final Socket clientSocket = serverSocket.accept();
			clientSocketCopy = clientSocket;
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					Scanner sc;
					try {
						sc = new Scanner(clientSocket.getInputStream());
						while (sc.hasNextLine()) {
							System.out.println("Client: "+sc.nextLine());
						}
						sc.close();
						clientSocket.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			});
			t1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			PrintWriter pr = new PrintWriter(clientSocketCopy.getOutputStream(), true);
			String line = reader.readLine();
			while (line != null) {
				System.out.println("Server: " + line);
				pr.println(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
