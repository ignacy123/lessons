package lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	private String number;

	public static void main(String[] args) {

		Socket socket = null;
		try {
			socket = new Socket("localhost", 12345);
		} catch (UnknownHostException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			final Socket socketCopy = socket;

			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					Scanner sc;
					try {
						sc = new Scanner(socketCopy.getInputStream());
						while (sc.hasNextLine()) {
							System.out.println("Server: "+sc.nextLine());
						}
						sc.close();
						socketCopy.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			});
			t1.start();
			PrintWriter pr = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				String line = reader.readLine();
				while (line != null) {
					pr.println(line);
					line = reader.readLine();

				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
