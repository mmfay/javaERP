package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import util.enums.HelperEnum;

public class MainWindow {

    public static JFrame mainFrame = null;
    
    public MainWindow() {

    }

    public void start() {
        mainFrame = new JFrame();
        
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}