package org.example.finterface;

import org.example.lambda.IOperacion;

public class FuncInterApp {

    public double operar (double x, double y) {
        IOperacion op = Double::sum;
        return op.calcular(x,y);
    }
    public static void main(String[] args) {
        FuncInterApp app = new FuncInterApp();
        app.operar(1,2);
        double repta = app.operar(2, 3);
        System.out.println(repta);
    }
}
