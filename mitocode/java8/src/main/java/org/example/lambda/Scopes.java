package org.example.lambda;

public class Scopes {

    private static double atributo1;
    private double atributo2;

    public double probarLocalVariable() {

        final double n3 = 3;
        IOperacion operacion = new IOperacion() {
            @Override
            public double calcular(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        IOperacion op = (x, y) -> {
            return x + y + n3;
        };

        return operacion.calcular(3, 3);
    }

    public double probarAtributosStaticVariable() {

        IOperacion operacion = (x,y) -> {
            atributo2 = x + y;
            return atributo2;
        };
        return operacion.calcular(3,2);
    }

    public static void main(String[] args) {
        Scopes app = new Scopes();
        System.out.println(app.probarAtributosStaticVariable());
    }

}
