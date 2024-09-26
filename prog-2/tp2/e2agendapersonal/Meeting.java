package tp2.e2agendapersonal;

import java.time.LocalDateTime;
import java.util.*;

public class Meeting {
    private long meetingId;
    private List<Person> personList;
    private String place;
    private String discussionTopic;
    private int meetingDurationInMinutes;
    private LocalDateTime meetingDate;

    public Meeting(long meetingId, String place, String discussionTopic, int meetingDurationInMinutes, LocalDateTime meetingDate) {
        this.meetingId = meetingId;
        this.place = place;
        this.discussionTopic = discussionTopic;
        this.meetingDurationInMinutes = meetingDurationInMinutes;
        this.meetingDate = meetingDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDiscussionTopic() {
        return discussionTopic;
    }

    public void setDiscussionTopic(String discussionTopic) {
        this.discussionTopic = discussionTopic;
    }

    public int getMeetingDurationInMinutes() {
        return meetingDurationInMinutes;
    }

    public void setMeetingDurationInMinutes(int meetingDurationInMinutes) {
        this.meetingDurationInMinutes = meetingDurationInMinutes;
    }

    public LocalDateTime getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDateTime meetingDate) {
        this.meetingDate = meetingDate;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingId=" + meetingId +
                ", personList=" + personList +
                ", place='" + place + '\'' +
                ", discussionTopic='" + discussionTopic + '\'' +
                ", meetingDurationInMinutes=" + meetingDurationInMinutes +
                ", meetingDate=" + meetingDate +
                '}';
    }

    public void addPerson(Person person) {

        if (personList == null) {
            personList = new ArrayList<>();
        }

        personList.add(person);
        System.out.println("Person added");
    }
}
