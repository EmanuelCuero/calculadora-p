package calculadora.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

        JPanel panelNumeros = new JPanel(new GridLayout(3, 2, 5, 5));
        panelNumeros.add(new JLabel("Primer numero:"));
        panelNumeros.add(campoPrimerNumero);
        panelNumeros.add(new JLabel("Segundo numero:"));
        panelNumeros.add(campoSegundoNumero);
        panelNumeros.add(new JLabel("Resultado:"));
        panelNumeros.add(campoResultado);

        JPanel panelBotones = new JPanel(new GridLayout(4, 2, 5, 5));
        panelBotones.add(botonSumar);
        panelBotones.add(botonRestar);
        panelBotones.add(botonMultiplicar);
        panelBotones.add(botonDividir);
        panelBotones.add(botonRaizCuadrada);
        panelBotones.add(botonRaizCubica);
        panelBotones.add(botonLogaritmoNatural);
        panelBotones.add(botonLimpiar);

        add(panelNumeros, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public JTextField getCampoPrimerNumero() { return campoPrimerNumero; }
    public JTextField getCampoSegundoNumero() { return campoSegundoNumero; }
    public JTextField getCampoResultado() { return campoResultado; }
    public JButton getBotonSumar() { return botonSumar; }
    public JButton getBotonRestar() { return botonRestar; }
    public JButton getBotonMultiplicar() { return botonMultiplicar; }
    public JButton getBotonDividir() { return botonDividir; }
    public JButton getBotonRaizCuadrada() { return botonRaizCuadrada; }
    public JButton getBotonRaizCubica() { return botonRaizCubica; }
    public JButton getBotonLogaritmoNatural() { return botonLogaritmoNatural; }
    public JButton getBotonLimpiar() { return botonLimpiar; }
}
