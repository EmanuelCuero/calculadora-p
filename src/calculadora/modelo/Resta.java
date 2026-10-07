package calculadora.modelo;

public class Resta extends OperacionBinaria {
    public Resta(double primerNumero, double segundoNumero) {
        super(primerNumero, segundoNumero);
    }

    @Override
    public double calcular() {
        return primerNumero - segundoNumero;
    }
}
