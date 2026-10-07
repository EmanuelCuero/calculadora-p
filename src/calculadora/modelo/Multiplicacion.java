package calculadora.modelo;

public class Multiplicacion extends OperacionBinaria {
    public Multiplicacion(double primerNumero, double segundoNumero) {
        super(primerNumero, segundoNumero);
    }

    @Override
    public double calcular() {
        return primerNumero * segundoNumero;
    }
}
