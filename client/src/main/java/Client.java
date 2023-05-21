import java.io.*;
import java.net.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
public class Client {

    private static Socket socket = null;
    private static JFrame mainFrame = null;
    public static void main(String[] args) {
        try {
            socket = new Socket("localhost",9000);
        } catch(Exception e) {
            System.out.println(e);
        }

        mainFrame = new JFrame();
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        mainFrame.setVisible(true);

    }

}