package tp2.e2agendapersonal;

import java.time.LocalDateTime;

public class PersonalAgendaMain {

    public static void main(String[] args) {

        Person p1 = new Person(1111, "P1@asdasd.com");
        Person p2 = new Person(2222, "P2@asdasd.com");

        LocalDateTime meetingDate = LocalDateTime.of(2024, 8, 29, 14, 0); // Example: 29th August 2024 at 14:00
        Meeting m1 = new Meeting(1, "Lobe", "IT",60, meetingDate);

        m1.addPerson(p1);
        m1.addPerson(p2);
        /////////////////////////////
        LocalDateTime meetingDate2 = LocalDateTime.of(2025, 8, 29, 14, 0); // Example: 29th August 2024 at 14:00
        Meeting m2 = new Meeting(2, "Lobe", "IT",60, meetingDate2);

        m1.addPerson(p1);
        m2.addPerson(p2);

        /////////////////////////////

        Agenda personalAgenda = new Agenda();
        personalAgenda.addMeeting(m1);
        personalAgenda.addMeeting(m2);
        personalAgenda.describeMeetingList();

    }
}

/* TODO: CONSULTAS
Esta bien el metodo de addMeeting en la agenda?
 */
