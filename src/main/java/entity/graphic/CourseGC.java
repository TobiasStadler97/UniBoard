package entity.graphic;

import entity.domaindata.Course;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class CourseGC extends GraphicalComponent {

    @OneToOne
    private Course course;

    public CourseGC() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
