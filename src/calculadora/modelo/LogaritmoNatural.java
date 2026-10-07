package calculadora.modelo;

public class LogaritmoNatural implements Operacion {
    private double numero;

    public LogaritmoNatural(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {
        if (numero <= 0) {
            throw new IllegalArgumentException("El logaritmo natural requiere un numero positivo.");
        }
        return Math.log(numero);
    }
}
