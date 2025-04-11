package MainProject.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.swing.border.*;
import javax.swing.SwingUtilities;

public class MainWindow extends JFrame {
    public MainWindow() {
        super("FIRST Diagnostics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(700, 700);

        // Variables
        Dimension dimension = new Dimension(300, 300);

        // Main Panel
        JPanel main = new JPanel(new BorderLayout());

        // North Left Panel 1
        JPanel NORTH_LEFT_panel1 = new JPanel();
        NORTH_LEFT_panel1.setBackground(BorderFactory.createLineBorder(Color.black, 3));
        NORTH_LEFT_panel1.setPreferredSize(dimension);
        JLabel panel1 = new JLabel("Panel 1");
        NORTH_LEFT_panel1.add(panel1);

        // North Left Panel 2
        JPanel NORTH_RIGHT_panel2 = new JPanel();
        NORTH_RIGHT_panel2.setBackground(BorderFactory.createLineBorder(Color.black, 3));
        NORTH_RIGHT_panel2.setPreferredSize(dimension);
        JLabel panel2 = new JLabel("Panel 2");
        NORTH_RIGHT_panel2.add(panel2);

        // South Left Panel 1
        JPanel SOUTH_LEFT_1 = new JPanel();
        SOUTH_LEFT_1.setBackground(BorderFactory.createLineBorder(Color.black, 3));
        SOUTH_LEFT_1.setPreferredSize(dimension);
        JLabel panel3 = new JLabel("Panel 3");
        SOUTH_LEFT_1.add(panel3);

        // South Right Panel 2
        JPanel SOUTH_RIGHT_2 = new JPanel();
        SOUTH_RIGHT_2.setBackground(BorderFactory.createLineBorder(Color.black, 3));
        SOUTH_RIGHT_2.setPreferredSize(dimension);
        JLabel panel4 = new JLabel("Panel 4");
        SOUTH_RIGHT_1.add(panel4);

        // MAIN NORTH PANEL
        JPanel north = new JPanel();
        north.add(NORTH_LEFT_panel1);
        north.add(NORTH_RIGHT_panel2);

        // MAIN SOUTH PANEL
        JPanel south = new JPanel();
        south.add(SOUTH_LEFT_1);
        south.add(SOUTH_RIGHT_2);

        // Add components to GUI
        main.add(north, BorderLayout.NORTH);
        main.add(south, BorderLayout.SOUTH);
        this.add(main);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}