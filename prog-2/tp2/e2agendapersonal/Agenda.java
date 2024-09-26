package tp2.e2agendapersonal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<Meeting> meetingList = new ArrayList<>();

    public boolean addMeeting(Meeting meeting) {

        if (!isValidDate(meeting)) {
            System.out.println("Invalid date, could not add meeting.");
            return false;
        }
        System.out.println("Meeting added to the agenda");
        meetingList.add(meeting);
        return true;
    }

    private boolean isValidDate(Meeting newMeeting) {
        //TODO: Todo este codigo, debe ir en meeting.
        for (Meeting existingMeeting : meetingList) {
            LocalDateTime existingStart = existingMeeting.getMeetingDate();
            LocalDateTime existingEnd = existingStart.plusMinutes(existingMeeting.getMeetingDurationInMinutes());

            LocalDateTime newStart = newMeeting.getMeetingDate();
            LocalDateTime newEnd = newStart.plusMinutes(newMeeting.getMeetingDurationInMinutes());


            if (newStart.isBefore(existingEnd) && newEnd.isAfter(existingStart)) {
                return false;
            }
        }
        return true;
    }

    public void describeMeetingList() {
        meetingList.forEach(System.out::println);
    }
}
