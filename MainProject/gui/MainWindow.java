package MainProject.gui;
import javax.swing.*;


public class MainWindow extends JFrame{
    public static void main(String[] args) {
        //main JFrame
        JFrame main = new JFrame("Main Window");

        //close the window
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        main.setSize(1000, 1000);

        // make the window visible
        main.setVisible(true);

        main.setResizable(true);
    }
}
