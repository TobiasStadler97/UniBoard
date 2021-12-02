package UniBoard.entity.domaindata;

import UniBoard.entity.users.Person;
import UniBoard.entity.users.User;
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
    @ManyToOne(cascade = CascadeType.ALL)
    private Person issuer;
    private LocalDateTime date_created;
    @OneToOne(cascade = CascadeType.ALL)
    private Discussion discussion_id;

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

    public void setIssuer(User issuer) {
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
