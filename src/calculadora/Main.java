package calculadora;

import javax.swing.SwingUtilities;
import calculadora.controlador.ControladorCalculadora;
import calculadora.vista.VentanaCalculadora;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaCalculadora ventana = new VentanaCalculadora();
            new ControladorCalculadora(ventana);
            ventana.setVisible(true);
        });
    }
}
