import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",12345);
            InputStream inputstream=socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputstream);
            int c =inputStreamReader.read();
            BufferedReader bufferedreader=new BufferedReader(inputStreamReader);
            while (true){
                System.out.println(bufferedreader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
