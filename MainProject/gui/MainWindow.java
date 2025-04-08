package MainProject.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        super("Window Object TESTER");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(650, 650);

        // Layout
        JPanel panel = new JPanel();
        JLabel label = new JLabel("I'm on electrical PIT CREW!!");
        JButton button = new JButton("Button_First_Test");

        // Button Function
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Main Window");
            }
        });

        // Components
        panel.add(label);
        panel.add(button);
        this.add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}