import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        int port = 4243; 

        try {
            //Create a connection to the server by creating a socket
            Socket newSock = new Socket("127.0.0.1", port);

            //Get the remote port open on the server
            System.out.println("The open port on the server is " + newSock.getPort());

            //Get the local port on the client
            System.out.println("The local port is " + newSock.getLocalPort()); 
            
        } catch (IOException ioe) {
            System.out.println("Problem connecting" + ioe.getMessage()); 
        }
    }
}
