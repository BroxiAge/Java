package org.example.lambda;

public interface IOperacion {

    //double calcularPromedio(double n1, double n2);
    double calcularPromedio();
    default double sumar(double n1, double n2){
        return n1 + n2;
    };

}
