package tp2.e5peluqueria;

import java.time.*;

public class Barber {

    private long barberId;
    private LocalDateTime workingStartTime; // Ejemplo: LocalDateTime.of(2024, 8, 29, 9, 0) para las 9 AM
    private LocalDateTime workingEndTime;   // Ejemplo: LocalDateTime.of(2024, 8, 29, 18, 0) para las 6 PM

    public Barber(long barberId, LocalDateTime workingStartTime, LocalDateTime workingEndTime) {
        this.barberId = barberId;
        this.workingStartTime = workingStartTime;
        this.workingEndTime = workingEndTime;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "barberId=" + barberId +
                ", workingStartTime=" + workingStartTime +
                ", workingEndTime=" + workingEndTime +
                '}';
    }

    public long getBarberId() {
        return barberId;
    }

    public void setBarberId(long barberId) {
        this.barberId = barberId;
    }

    public LocalDateTime getWorkingStartTime() {
        return workingStartTime;
    }

    public void setWorkingStartTime(LocalDateTime workingStartTime) {
        this.workingStartTime = workingStartTime;
    }

    public LocalDateTime getWorkingEndTime() {
        return workingEndTime;
    }

    public void setWorkingEndTime(LocalDateTime workingEndTime) {
        this.workingEndTime = workingEndTime;
    }
}
