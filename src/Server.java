import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
           Socket socket= serverSocket.accept();

            OutputStream outputStream=socket.getOutputStream();
            System.out.println("connection establish");


            PrintWriter printWriter= new PrintWriter(outputStream,true);

            while(true){
                Scanner input =new Scanner(System.in);
                String userinput=input.nextLine();
                printWriter.println(userinput);

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}