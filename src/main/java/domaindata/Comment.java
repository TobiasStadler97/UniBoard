package domaindata;

import com.sun.istack.NotNull;
import users.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Comment {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String content;
    @ManyToOne
    private Person commenter;

    private LocalDateTime created;

    public Comment() {
        created = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Person getCommenter() {
        return commenter;
    }

    public void setCommenter(Person commenter) {
        this.commenter = commenter;
    }
}
