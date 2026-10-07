package calculadora.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VentanaCalculadora extends JFrame {
    private JTextField campoPrimerNumero = new JTextField(10);
    private JTextField campoSegundoNumero = new JTextField(10);
    private JTextField campoResultado = new JTextField(15);
    private JButton botonSumar = new JButton("Sumar");
    private JButton botonRestar = new JButton("Restar");
    private JButton botonMultiplicar = new JButton("Multiplicar");
    private JButton botonDividir = new JButton("Dividir");
    private JButton botonRaizCuadrada = new JButton("Raiz cuadrada");
    private JButton botonRaizCubica = new JButton("Raiz cubica");
    private JButton botonLogaritmoNatural = new JButton("Logaritmo natural");
    private JButton botonLimpiar = new JButton("Limpiar");

    public VentanaCalculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoResultado.setEditable(false);
    }
}
