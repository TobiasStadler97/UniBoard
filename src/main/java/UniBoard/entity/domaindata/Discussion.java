package UniBoard.entity.domaindata;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Discussion extends TextField {

    /*
    course
    comment_array
    date_created
    issuer
    title
     */

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
