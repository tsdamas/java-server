import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        int port = 4243; 
        if(args.length > 0) port = Integer.parseInt(args[0]); 

        try {
            //Create a connection to the server by creating a socket
            Socket newSock = new Socket(port);  
            
        } catch (IOException ioe) {
            System.out.println("Problem connecting" + ioe.getMessage()); 
        }
    }
}
