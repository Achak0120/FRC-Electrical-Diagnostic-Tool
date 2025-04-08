package MainProject.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
    public MainWindow() {
        super("Window Object");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(650, 650);

        // Layout
        JPanel panel = new JPanel();
        JLabel label = new JLabel("I'm on electrical PIT CREW!!");

        // Button Function

        // Components
        panel.add(label);
        this.add(panel);
    }
}