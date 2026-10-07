package calculadora.modelo;

public abstract class OperacionBinaria implements Operacion {
    protected double primerNumero;
    protected double segundoNumero;

    public OperacionBinaria(double primerNumero, double segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }
}
