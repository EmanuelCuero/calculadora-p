package calculadora.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCalculadora extends JFrame {
    private JTextField campoPrimerNumero = new JTextField(10);
    private JTextField campoSegundoNumero = new JTextField(10);

    public VentanaCalculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
