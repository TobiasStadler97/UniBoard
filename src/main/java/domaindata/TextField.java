package domaindata;

import com.sun.istack.NotNull;
import users.Person;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Entity // do you still need entity if you use the mapped superclass inheritance?
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
}
