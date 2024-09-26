package tp2.e5peluqueria;

import java.time.*;
import java.util.*;

public class HairSalon {

    private static final LocalDateTime WORKING_START = LocalDateTime.of(2024, 8, 29, 9, 0); // Example: 29th August 2024 at 14:00
    private static final LocalDateTime WORKING_END = LocalDateTime.of(2024, 8, 29, 6, 0); // Example: 29th August 2024 at 14:00

    Barber b1 = new Barber(1, WORKING_START, WORKING_END);
    Barber b2 = new Barber(2, WORKING_START, WORKING_END);
    Barber b3 = new Barber(3, WORKING_START, WORKING_END);
    Barber b4 = new Barber(4, WORKING_START, WORKING_END);

    List<Barber> employeeList = List.of(b1, b2, b3, b4);
    List<Turn> turnList;

    public HairSalon () {
        this.turnList = new ArrayList<>();
    }

    public void scheduleTurn(Turn turn) {

        this.turnList.add(turn);
    }

    public void printTurnList() {
        for (Turn turn : turnList) {
            System.out.println("Turn reserved: " + turn);
        }
    }

    public void printEmployeeList() {
        for (Barber barber : employeeList) {
            System.out.println(barber);
        }
    }

    public Turn findAvailableTurn() {

        for (Barber barber : employeeList) {
            LocalDateTime startTime = barber.getWorkingStartTime();
            LocalDateTime endTime = barber.getWorkingEndTime();

            while (startTime.isBefore(endTime)) {
                final LocalDateTime slot = startTime;

                boolean isAvailable = true;

                for (Turn turn : turnList) {
                    if (turn.getBarber().equals(barber) && turn.getSlotScheluded().equals(slot)) {
                        isAvailable = false;
                    }
                }

                if (isAvailable) {
                    return new Turn(null, barber, slot);
                }

                startTime = startTime.plusMinutes(30);
            }
        }

        return null; // Si no se encuentra un turno disponible
    }

}
