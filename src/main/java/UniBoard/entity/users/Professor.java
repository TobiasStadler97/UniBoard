package UniBoard.entity.users;

import UniBoard.entity.domaindata.Course;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Professor extends Person {

    @OneToMany(mappedBy = "professor")
    private List<Course> courses;

    public Professor() {
    }

    public List<Course> getCourses() {
        return courses;
    }
}
