package calculadora.modelo;

public class RaizCuadrada implements Operacion {
    private double numero;

    public RaizCuadrada(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {
        if (numero < 0) {
            throw new IllegalArgumentException("La raiz cuadrada requiere un numero no negativo.");
        }
        return Math.sqrt(numero);
    }
}
