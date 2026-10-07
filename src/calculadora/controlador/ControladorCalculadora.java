package calculadora.controlador;

import calculadora.modelo.Division;
import calculadora.modelo.Multiplicacion;
import calculadora.modelo.Operacion;
import calculadora.modelo.Resta;
import calculadora.modelo.Suma;
import calculadora.vista.VentanaCalculadora;

public class ControladorCalculadora {
    private VentanaCalculadora ventana;

    public ControladorCalculadora(VentanaCalculadora ventana) {
        this.ventana = ventana;
        ventana.getBotonSumar().addActionListener(e -> calcular(new Suma(leerPrimero(), leerSegundo())));
        ventana.getBotonRestar().addActionListener(e -> calcular(new Resta(leerPrimero(), leerSegundo())));
        ventana.getBotonMultiplicar().addActionListener(e -> calcular(new Multiplicacion(leerPrimero(), leerSegundo())));
        ventana.getBotonDividir().addActionListener(e -> calcular(new Division(leerPrimero(), leerSegundo())));
    }

    private double leerPrimero() {
        return Double.parseDouble(ventana.getCampoPrimerNumero().getText());
    }

    private double leerSegundo() {
        return Double.parseDouble(ventana.getCampoSegundoNumero().getText());
    }

    private void calcular(Operacion operacion) {
        ventana.getCampoResultado().setText(String.valueOf(operacion.calcular()));
    }
}
