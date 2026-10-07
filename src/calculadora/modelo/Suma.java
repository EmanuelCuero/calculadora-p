package calculadora.modelo;

public class Suma extends OperacionBinaria {
    public Suma(double primerNumero, double segundoNumero) {
        super(primerNumero, segundoNumero);
    }

    @Override
    public double calcular() {
        return primerNumero + segundoNumero;
    }
}
