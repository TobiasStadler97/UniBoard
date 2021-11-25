package UniBoard.entity.domaindata;

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

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
