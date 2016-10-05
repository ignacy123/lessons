package lesson20;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketTest {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 12345);
			PrintWriter pr = new PrintWriter(socket.getOutputStream(), true);
			pr.println("asdf");
			pr.println("qwe");
			pr.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
