package domaindata;

import users.Professor;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    @OneToMany
    private List<TimeSlot> timeSlots;
    @ManyToOne
    private Professor professor;
    @OneToOne
    private CommentArea commentArea;

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

    public CommentArea getCommentArea() {
        return commentArea;
    }

    public void setCommentArea(CommentArea commentArea) {
        this.commentArea = commentArea;
    }
}
