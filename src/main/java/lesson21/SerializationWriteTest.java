package lesson21;

import java.io.*;

/**
 * Created by ignacy on 29.10.15.
 */
public class SerializationWriteTest {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setFirstName("Janusz");
        user.setLastName("Kowalski");
        user.setLogin("janusz345");
        user.setPassword("tajnehaslo");
        user.setNonSaveable("cokolwiek");
        File userData = File.createTempFile("asdf", ".obj");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(userData));
        outputStream.writeObject(user);
        outputStream.flush();
        outputStream.close();
        System.out.println("saved user data to: " + userData.getAbsolutePath());
    }
}
