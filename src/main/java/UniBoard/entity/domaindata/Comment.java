package UniBoard.entity.domaindata;

import UniBoard.entity.users.Person;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment{

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String content;
    @ManyToOne
    private Person issuer;
    @OneToOne
    private Discussion discussion_id;

    private LocalDateTime date_created;

    public Comment() {
        date_created = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Person getIssuer() {
        return issuer;
    }

    public void setIssuer(Person issuer) {
        this.issuer = issuer;
    }

    public Discussion getDiscussion_id() {
        return discussion_id;
    }

    public void setDiscussion_id(Discussion discussion_id) {
        this.discussion_id = discussion_id;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    public int getId() {
        return id;
    }



}
