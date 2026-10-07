package calculadora.modelo;

public class RaizCubica implements Operacion {
    private double numero;

    public RaizCubica(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {
        return Math.cbrt(numero);
    }
}
