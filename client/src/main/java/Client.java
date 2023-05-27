import java.io.*;
import java.net.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import util.enums.HelperEnum;
import ui.MainWindow;
public class Client {

    private static Socket socket = null;
    private static MainWindow mw;
    public static void main(String[] args) {

        try {
            socket = new Socket("localhost",9000);
        } catch(Exception e) {
            System.out.println(e);
        }

        mw = new MainWindow();
        mw.start();


    }

}