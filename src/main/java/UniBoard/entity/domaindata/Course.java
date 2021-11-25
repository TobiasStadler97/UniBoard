package UniBoard.entity.domaindata;

import org.springframework.hateoas.Link;

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
    private String professor; // must be changed into a Professor class at some point
    @OneToMany
    private List<Discussion> discussions_list;
    //private String[] links_list;
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
