package lesson21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

/**
 * Created by ignacy on 29.10.15.
 */
public class SerializationReadTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        assert args.length > 0;
        String userDataPath = args[0];
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(userDataPath));
        User user = (User) inputStream.readObject();
        System.out.println(user);
        inputStream.close();

    }
}
