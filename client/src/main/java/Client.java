import java.io.*;
import java.net.*;

public class Client {

    private static Socket socket = null;
    
    public static void main(String[] args) {
        try {
            socket = new Socket("localhost",8080);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}