package MainProject.gui;

import java.awt.*;
import awt.event.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
    public MainWindow() {
        super("FIRST Diagnostics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(700, 700);

        // Main Panel
        JPanel main = new JPanel(new BorderLayout());
        JPanel NORTH_LEFT_panel1 = new JPanel();
        JPanel NORTH_RIGHT_panel2 = new JPanel();




        // Add components to GUI
        main.add(NORTH_LEFT_panel1, BorderLayout.NORTH);
        main.add(NORTH_RIGHT_panel2, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}