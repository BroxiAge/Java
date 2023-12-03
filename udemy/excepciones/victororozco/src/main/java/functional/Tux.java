package functional;

public class Tux implements MyFunctionalInterface {

    @Override
    public String doSomething(String param) {

        return "Hola soy Tux, y recibí el siguiente parametro: " + param;
    }
}
