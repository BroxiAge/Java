package org.mitocode.dateapi;

import java.time.LocalDate;
import java.util.Calendar;

public class DateApp {

    public void verificar (int version) {
        if (version == 7) {
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();

            fecha1.set(1991, 01, 21);
            System.out.println(fecha1.after(fecha2));
        } else if (version == 8) {
            LocalDate fecha1 = LocalDate.of(1991, 01, 21);
            LocalDate fecha2 = LocalDate.now();

            System.out.println(fecha1.isAfter(fecha2));
            System.out.println(fecha1.isBefore(fecha2));

            LocalDate tiempo1 = LocalDate.of(22, 12, 50);
            LocalDate tiempo2 = LocalDate.now();

            System.out.println(fecha1.isAfter(fecha2));
            System.out.println(fecha1.isBefore(fecha2));

        }
    }

    public static void main(String[] args) {
        DateApp app = new DateApp();

        app.verificar(8);
    }

}
