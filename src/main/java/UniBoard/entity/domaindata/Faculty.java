package UniBoard.entity.domaindata;

import javax.persistence.*;

@Entity
public class Faculty {

    /*
    faculty instead of facultygc
    name
    id
    course_list
     */

    @Id
    @GeneratedValue
    private int id;

    private String name;


    public Faculty() {
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
