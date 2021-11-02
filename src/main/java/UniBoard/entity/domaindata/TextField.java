package UniBoard.entity.domaindata;

import com.sun.istack.NotNull;
import UniBoard.entity.users.Person;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TextField {
    @Id
    @GeneratedValue
    protected int id;

    @NotNull
    protected String content;
    @ManyToOne
    protected Person commenter;

    protected LocalDateTime created;

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
