import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NameServer {

    public static void main(String[] args) throws IOException {
        URL connection = new URL("http://localhost:8080/LocateFile?fileName=jej.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(
                connection.openStream()));
        String message = in.readLine();
        System.out.println(message);
    }
}