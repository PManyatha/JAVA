package EventManagementSystem;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    String name;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;
    String location;

    public Event(String name,LocalDate date,LocalTime startTime,LocalTime endTime,String location) {
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }


    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("name='").append(name).append('\'');
        sb.append(", date=").append(date);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", location='").append(location).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
