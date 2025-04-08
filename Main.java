import javax.swing.SwingUtilities;
import MainProject.gui.MainWindow;  // Correct import statement

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}

