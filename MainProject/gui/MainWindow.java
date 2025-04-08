package MainProject.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
        button.addActionListener(e -> label.setText("Main Window"));

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