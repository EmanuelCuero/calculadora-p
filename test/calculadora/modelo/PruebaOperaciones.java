package calculadora.modelo;

public class PruebaOperaciones {
    public static void main(String[] args) {
        comprobarCercano("suma", 7, new Suma(3, 4).calcular());
        comprobarCercano("resta", 2, new Resta(5, 3).calcular());
        comprobarCercano("multiplicacion", 12, new Multiplicacion(3, 4).calcular());
        comprobarCercano("division", 2, new Division(8, 4).calcular());
        comprobarCercano("raiz cuadrada", 3, new RaizCuadrada(9).calcular());`r`n        comprobarCercano("raiz cubica", -2, new RaizCubica(-8).calcular());`r`n        comprobarCercano("logaritmo natural", Math.log(2), new LogaritmoNatural(2).calcular());`r`n        comprobarError("division entre cero", () -> new Division(4, 0).calcular());`r`n        comprobarError("raiz cuadrada negativa", () -> new RaizCuadrada(-1).calcular());`r`n        comprobarError("logaritmo de cero", () -> new LogaritmoNatural(0).calcular());`r`n        comprobarError("logaritmo negativo", () -> new LogaritmoNatural(-1).calcular());`r`n        System.out.println("Todas las pruebas del modelo son correctas.");
    }

    private static void comprobarError(String nombre, Runnable operacion) {`r`n        try {`r`n            operacion.run();`r`n            throw new AssertionError(nombre + ": se esperaba un error");`r`n        } catch (IllegalArgumentException esperado) {`r`n            // La operacion rechazo el valor no permitido.`r`n        }`r`n    }`r`n`r`n    private static void comprobarCercano(String nombre, double esperado, double obtenido) {
        if (Math.abs(esperado - obtenido) > 0.000001) {
            throw new AssertionError(nombre + ": se esperaba " + esperado + " y se obtuvo " + obtenido);
        }
    }
}


