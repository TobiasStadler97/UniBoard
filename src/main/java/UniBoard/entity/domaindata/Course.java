package UniBoard.entity.domaindata;

import UniBoard.entity.users.Professor;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    /*
    discussion_array
     */

    @Id
    @GeneratedValue
    private int id;

    private String name;
    @OneToMany
    private List<TimeSlot> timeSlots;
    @ManyToOne
    private Professor professor;




    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }

    public TimeSlot getTimeSlot(int i) {
        return timeSlots.get(i);
    }

    public void addTimeSlot(TimeSlot timeSlot) {
        this.timeSlots.add(timeSlot);
    }

    public void removeTimeSlot(TimeSlot timeSlot) {
        this.timeSlots.remove(timeSlot);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setTimeSlots(List<TimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
    }


    public int getId() {
        return id;
    }
}
