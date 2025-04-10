package MainProject.gui;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        NORTH_LEFT_panel1.setPreferredSize(dimension);
        JLabel panel1 = new JLabel("Panel 1");
        NORTH_LEFT_panel1.add(panel1);

        // North Left Panel 2
        JPanel NORTH_RIGHT_panel2 = new JPanel();
        NORTH_RIGHT_panel2.setPreferredSize(dimension);
        JLabel panel2 = new JLabel("Panel 2");
        NORTH_RIGHT_panel2.add(panel2);

        // MAIN NORTH PANEL
        JPanel north = new JPanel();
        north.add(NORTH_LEFT_panel1);
        north.add(NORTH_RIGHT_panel2);

        // Add components to GUI
        main.add(north, BorderLayout.NORTH);
        this.add(main);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}