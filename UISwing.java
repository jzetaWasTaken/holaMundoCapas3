package holaMundoCapas3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UISwing implements UIInterface
{
    public void mostrarSaludo(String saludo)
    {
        JFrame frame = new JFrame("Sample frame");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, saludo);
    }
}
