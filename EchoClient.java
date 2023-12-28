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

            //Ask user what message to send to the server
            Scanner input = new Scanner(System.in); 
            System.out.print("Please enter the message to send: ");
            String message = input.nextLine(); 

            //Send the message to the server
            PrintWriter netOut = new PrintWriter(sock.getOutputStream());
            netOut.println(message); 
            
            //The output is buffered, so force to send it
            netOut.flush(); 

            //Create a stream to receive inputs from server
            Scanner netIn = new Scanner(newSock.getInputStream()); 
            String response = netIn.nextLine(); 
            netIn.println(response);

            //Close streams
            netOut.close();
            netIn.close();
            socke.close();

        } catch (IOException ioe) {
            System.out.println("Problem connecting" + ioe.getMessage()); 
        }
    }
}
