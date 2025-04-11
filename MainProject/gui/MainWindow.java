package MainProject.gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

public class MainWindow extends JFrame {
    public MainWindow() {
        super("FIRST Diagnostics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(700, 700);

        // Main Panel with GridBagLayout for proportional resizing
        JPanel main = new JPanel(new GridBagLayout());
        SpringLayout layout = new SpringLayout();
        main.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        main.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // Top Left Panel
        JPanel top_left = new JPanel();
        top_left.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JLabel label1 = new JLabel("Label 1");
        top_left.add(label1);

        // Top Right Panel
        JPanel top_right = new JPanel();
        top_right.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JLabel label2 = new JLabel("Label 2");
        top_right.add(label2);

        // Bottom Left Panel
        JPanel bot_left = new JPanel();
        bot_left.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JLabel label3 = new JLabel("Label 3");
        bot_left.add(label3);

        // Bottom Right Panel
        JPanel bot_right = new JPanel();
        bot_right.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JLabel label4 = new JLabel("Label 4");
        bot_right.add(label4);

        // Add Subpanels to main
        main.add(top_left);
        main.add(top_right);
        main.add(bot_left);
        main.add(bot_right);


        // SpringLayout layout
        layout.putConstraint(SpringLayout.NORTH, bot_left, 0, SpringLayout.SOUTH, top_left);
        layout.putConstraint(SpringLayout.WEST, top_right, 0, SpringLayout.EAST, top_left);
        layout.putConstraint(SpringLayout.WEST, bot_right, 0, SpringLayout.EAST, bot_left);
        layout.putConstraint(SpringLayout.NORTH, bot_right, 0, SpringLayout.SOUTH, top_left);

        layout.putConstraint(SpringLayout.WEST, top_left, 20, SpringLayout.WEST, main);
        layout.putConstraint(SpringLayout.WEST, bot_left, 20, SpringLayout.WEST, main);
        layout.putConstraint(SpringLayout.NORTH, top_left, 20, SpringLayout.NORTH, main);
        layout.putConstraint(SpringLayout.NORTH, top_right, 20, SpringLayout.NORTH, main);

        // Add main panel to frame
        add(main);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}

