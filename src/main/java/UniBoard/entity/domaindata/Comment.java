package UniBoard.entity.domaindata;

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
    private User issuer;
    private LocalDateTime date_created;
    @OneToOne(cascade = CascadeType.ALL)
    private Discussion discussion;

    public Comment() {
        date_created = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getIssuer() {
        return issuer;
    }

    public void setIssuer(User issuer) {
        this.issuer = issuer;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
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
