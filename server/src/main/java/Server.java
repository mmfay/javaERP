import java.io.*;
import java.net.*;

public class Server {

    private static ClientThread clientThread;

    public static void main(String[] args) {
        
        // Check if LoadBalancer enabled redirect connection to LB, Let LB make choice, send back to Client.

        // look for connections
        connections();

        
    }

    public static void connections() {

        while(true) {
            try {
                ServerSocket ss = new ServerSocket(8000);
                Socket s = ss.accept();

                // send to thread
                clientThread = new ClientThread(s);
                Thread thread = new Thread(clientThread);
                thread.start();
            } catch(Exception e) {
                //create stacktrace infobox
                System.out.println(e);
            }
        }

    }

    public static class ClientThread implements Runnable {

        Socket s;

        public ClientThread(Socket s) {
            this.s = s;
        }

        public void run(){
            System.out.println("Client Connected");
        }
    }
}