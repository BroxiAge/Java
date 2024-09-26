package tp1.e1;


import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        Persona nahuel = new Persona("Nahuel", 31, LocalDate.of(1993, 3, 12), 37385519, 'M', 81.07, 170.0);

        nahuel.isHealthier();
        System.out.println(nahuel);
    }
}
