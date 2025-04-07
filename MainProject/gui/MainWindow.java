package MainProject.gui;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame 
{
    public MainWindow() 
    {
        super("Window Object TESTER");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(400, 400);

        // Layout
        JPanel panel = new JPanel();
        JPanel label = new JLabel("Im on electrial PIT CREW!!");
        JButton button = new JButton("Button_First_Test")
    
        // Button Function
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("Main Window");
            }
        });
    
        // Components
        panel.add(label);
        panel.add(button);
        this.add(panel);
    }


    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        })

    }
}
