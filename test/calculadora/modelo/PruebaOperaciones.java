package calculadora.modelo;

public class PruebaOperaciones {
    public static void main(String[] args) {
        comprobarCercano("suma", 7, new Suma(3, 4).calcular());
        comprobarCercano("resta", 2, new Resta(5, 3).calcular());
        comprobarCercano("multiplicacion", 12, new Multiplicacion(3, 4).calcular());
        comprobarCercano("division", 2, new Division(8, 4).calcular());
        comprobarCercano("raiz cuadrada", 3, new RaizCuadrada(9).calcular());
        comprobarCercano("raiz cubica", -2, new RaizCubica(-8).calcular());
        comprobarCercano("logaritmo natural", Math.log(2), new LogaritmoNatural(2).calcular());

        comprobarError("division entre cero", () -> new Division(4, 0).calcular());
        comprobarError("raiz cuadrada negativa", () -> new RaizCuadrada(-1).calcular());
        comprobarError("logaritmo de cero", () -> new LogaritmoNatural(0).calcular());
        comprobarError("logaritmo negativo", () -> new LogaritmoNatural(-1).calcular());

        System.out.println("Todas las pruebas del modelo son correctas.");
    }

    private static void comprobarError(String nombre, Runnable operacion) {
        try {
            operacion.run();
            throw new AssertionError(nombre + ": se esperaba un error");
        } catch (IllegalArgumentException esperado) {
            // La operacion rechazo el valor no permitido.
        }
    }

    private static void comprobarCercano(String nombre, double esperado, double obtenido) {
        if (Math.abs(esperado - obtenido) > 0.000001) {
            throw new AssertionError(nombre + ": se esperaba " + esperado + " y se obtuvo " + obtenido);
        }
    }
}
