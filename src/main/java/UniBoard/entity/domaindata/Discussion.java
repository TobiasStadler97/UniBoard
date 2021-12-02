package UniBoard.entity.domaindata;

import UniBoard.entity.users.Person;
import UniBoard.entity.users.User;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Discussion{

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    private Person issuer;
    private LocalDateTime date_created;
    @OneToOne(cascade = CascadeType.ALL)
    private Course course;
    @OneToMany
    private List<Comment> comment_list;

    public Discussion() {
        date_created = LocalDateTime.now();
        comment_list = new LinkedList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getIssuer() {
        return issuer;
    }

    public void setIssuer(User issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Comment> getComment_list() {
        return comment_list;
    }

    public void setComment_list(List<Comment> comment_list) {
        this.comment_list = comment_list;
    }

    public int getId() {
        return id;
    }

    public void addComment(Comment comment){
        comment_list.add(comment);
    }

    public void removeComment(Comment comment){
        comment_list.remove(comment);
    }

}
