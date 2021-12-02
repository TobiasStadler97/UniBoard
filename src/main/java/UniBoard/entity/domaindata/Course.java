package UniBoard.entity.domaindata;

import javax.persistence.*;
import java.util.LinkedList;
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
    @OneToMany(cascade = CascadeType.ALL)
    private List<Discussion> discussions_list;
    //private String[] links_list;
    public Course() {
        discussions_list = new LinkedList<>();
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

    public void addDiscusison(Discussion discussion){
        discussions_list.add(discussion);
    }

    public void removeDiscussion(Discussion discussion){
        discussions_list.remove(discussion);
    }

}
