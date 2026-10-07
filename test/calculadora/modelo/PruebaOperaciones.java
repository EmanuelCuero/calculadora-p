package calculadora.modelo;

public class PruebaOperaciones {
    public static void main(String[] args) {
        comprobarCercano("suma", 7, new Suma(3, 4).calcular());
        comprobarCercano("resta", 2, new Resta(5, 3).calcular());
        comprobarCercano("multiplicacion", 12, new Multiplicacion(3, 4).calcular());
        comprobarCercano("division", 2, new Division(8, 4).calcular());
        System.out.println("Pruebas de operaciones basicas correctas.");
    }

    private static void comprobarCercano(String nombre, double esperado, double obtenido) {
        if (Math.abs(esperado - obtenido) > 0.000001) {
            throw new AssertionError(nombre + ": se esperaba " + esperado + " y se obtuvo " + obtenido);
        }
    }
}
