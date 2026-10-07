package calculadora.controlador;

import calculadora.modelo.Division;
import calculadora.modelo.LogaritmoNatural;
import calculadora.modelo.Multiplicacion;
import calculadora.modelo.Operacion;
import calculadora.modelo.RaizCuadrada;
import calculadora.modelo.RaizCubica;
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
        ventana.getBotonRaizCuadrada().addActionListener(e -> calcular(new RaizCuadrada(leerPrimero())));
        ventana.getBotonRaizCubica().addActionListener(e -> calcular(new RaizCubica(leerPrimero())));
        ventana.getBotonLogaritmoNatural().addActionListener(e -> calcular(new LogaritmoNatural(leerPrimero())));
        ventana.getBotonLimpiar().addActionListener(e -> limpiar());
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

    private void limpiar() {
        ventana.getCampoPrimerNumero().setText("");
        ventana.getCampoSegundoNumero().setText("");
        ventana.getCampoResultado().setText("");
    }
}
