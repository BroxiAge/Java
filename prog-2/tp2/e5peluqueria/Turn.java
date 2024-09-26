package tp2.e5peluqueria;

import java.time.LocalDateTime;

public class Turn {

    private Customer customer;
    private Barber barber;
    private LocalDateTime slotScheluded;

    public Turn () {

    }

    public Turn(Customer customer, Barber barber, LocalDateTime slotScheluded) {
        this.customer = customer;
        this.barber = barber;
        this.slotScheluded = slotScheluded;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Barber getBarber() {
        return barber;
    }

    public void setBarber(Barber barber) {
        this.barber = barber;
    }

    public LocalDateTime getSlotScheluded() {
        return slotScheluded;
    }

    public void setSlotScheluded(LocalDateTime slotScheluded) {
        this.slotScheluded = slotScheluded;
    }

    @Override
    public String toString() {
        return "Turn{" +
                "customer=" + customer +
                ", barber=" + barber +
                ", slotScheluded=" + slotScheluded +
                '}';
    }


}
