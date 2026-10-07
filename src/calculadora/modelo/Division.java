package calculadora.modelo;

public class Division extends OperacionBinaria {
    public Division(double primerNumero, double segundoNumero) {
        super(primerNumero, segundoNumero);
    }

    @Override
    public double calcular() {
        if (segundoNumero == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return primerNumero / segundoNumero;
    }
}
