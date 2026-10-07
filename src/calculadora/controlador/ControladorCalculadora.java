package calculadora.controlador;

import calculadora.modelo.Operacion;
import calculadora.modelo.Resta;
import calculadora.modelo.Suma;
import calculadora.vista.VentanaCalculadora;

public class ControladorCalculadora {
    private VentanaCalculadora ventana;

    public ControladorCalculadora(VentanaCalculadora ventana) {
        this.ventana = ventana;
        ventana.getBotonSumar().addActionListener(e -> calcularSuma());
        ventana.getBotonRestar().addActionListener(e -> calcularResta());
    }

    private void calcularSuma() {
        double primero = Double.parseDouble(ventana.getCampoPrimerNumero().getText());
        double segundo = Double.parseDouble(ventana.getCampoSegundoNumero().getText());
        Operacion operacion = new Suma(primero, segundo);
        ventana.getCampoResultado().setText(String.valueOf(operacion.calcular()));
    }

    private void calcularResta() {
        double primero = Double.parseDouble(ventana.getCampoPrimerNumero().getText());
        double segundo = Double.parseDouble(ventana.getCampoSegundoNumero().getText());
        Operacion operacion = new Resta(primero, segundo);
        ventana.getCampoResultado().setText(String.valueOf(operacion.calcular()));
    }
}
