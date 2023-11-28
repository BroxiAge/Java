package org.mitocode.optional;

import java.util.Optional;

public class OptionalApp {

    public void probar(String valor) {
        System.out.println(valor.contains("mito"));

        try {
            Optional op = Optional.empty();
            op.get();
        }catch (Exception e) {
            System.out.println("No hay elemento");
        }
    }

    public void orElse (String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        String x = op.orElse("Predeterminado");
        System.out.println(x);
    }

    public void isPresent (String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }

    public void orElseThrow (String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        String x = op.orElseThrow(NumberFormatException::new);
    }

    public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
        // app.probar("Mito");
        //app.orElseThrow("Mito");
        app.isPresent("Mito");
    }
}
