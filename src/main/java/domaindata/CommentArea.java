package domaindata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class CommentArea {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    private List<Discussion> discussions;

    public CommentArea() {
    }

    public List<Discussion> getDiscussions() {
        return discussions;
    }

    public Discussion getDiscussion(int i) {
        return discussions.get(i);
    }

    public void addComment(Discussion discussion) {
        this.discussions.add(discussion);
    }

    public void removeComment(Discussion discussion) {
        this.discussions.remove(discussion);
    }


}
