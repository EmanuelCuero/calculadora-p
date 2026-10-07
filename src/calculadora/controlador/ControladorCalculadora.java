package calculadora.controlador;

import javax.swing.JOptionPane;
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
        ventana.getBotonSumar().addActionListener(e -> ejecutar(() -> new Suma(leerPrimero(), leerSegundo())));
        ventana.getBotonRestar().addActionListener(e -> ejecutar(() -> new Resta(leerPrimero(), leerSegundo())));
        ventana.getBotonMultiplicar().addActionListener(e -> ejecutar(() -> new Multiplicacion(leerPrimero(), leerSegundo())));
        ventana.getBotonDividir().addActionListener(e -> ejecutar(() -> new Division(leerPrimero(), leerSegundo())));
        ventana.getBotonRaizCuadrada().addActionListener(e -> ejecutar(() -> new RaizCuadrada(leerPrimero())));
        ventana.getBotonRaizCubica().addActionListener(e -> ejecutar(() -> new RaizCubica(leerPrimero())));
        ventana.getBotonLogaritmoNatural().addActionListener(e -> ejecutar(() -> new LogaritmoNatural(leerPrimero())));
        ventana.getBotonLimpiar().addActionListener(e -> limpiar());
    }

    private double leerPrimero() {
        String texto = ventana.getCampoPrimerNumero().getText().trim();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("Escribe el primer numero.");
        }
        return Double.parseDouble(texto);
    }

    private double leerSegundo() {
        String texto = ventana.getCampoSegundoNumero().getText().trim();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("Escribe el segundo numero.");
        }
        return Double.parseDouble(texto);
    }

    private void ejecutar(OperacionPendiente pendiente) {
        try {
            Operacion operacion = pendiente.crear();
            ventana.getCampoResultado().setText(String.valueOf(operacion.calcular()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(ventana, "Escribe un valor numerico valido.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(ventana, e.getMessage(), "Operacion invalida", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        ventana.getCampoPrimerNumero().setText("");
        ventana.getCampoSegundoNumero().setText("");
        ventana.getCampoResultado().setText("");
    }

    private interface OperacionPendiente {
        Operacion crear();
    }
}
