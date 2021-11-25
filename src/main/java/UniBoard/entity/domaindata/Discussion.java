package UniBoard.entity.domaindata;

import UniBoard.entity.users.Person;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Discussion{

    /*
    course
    comment_array
    date_created
    issuer
    title
     */

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String title;
    @ManyToOne
    private Person commenter;

    private LocalDateTime created;

    @OneToMany()
    private List<Comment> comments;

    public Discussion() {
        created = LocalDateTime.now();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Person getCommenter() {
        return commenter;
    }

    public void setCommenter(Person commenter) {
        this.commenter = commenter;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public int getId() {
        return id;
    }

}
