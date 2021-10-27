package domaindata;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Discussion extends TextField {

    @OneToMany()
    private List<Comment> comments;

    public Discussion() {
        created = LocalDateTime.now();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Comment getComment(int i) {
        return comments.get(i);
    }
}
