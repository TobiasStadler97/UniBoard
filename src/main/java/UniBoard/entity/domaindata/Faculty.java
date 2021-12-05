package UniBoard.entity.domaindata;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany
    private List<Course> course_list;

    public Faculty() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse_list() {
        return course_list;
    }

    public void setCourse_list(List<Course> course_list) {
        this.course_list = course_list;
    }

    public int getId() {
        return id;
    }
}
