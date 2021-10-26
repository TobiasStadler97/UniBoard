package domaindata;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class TimeSlot {
    @Id
    @GeneratedValue
    private int id;

    private Time startTime;
    private Time endTime;
    private String dayOfWeek;

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
