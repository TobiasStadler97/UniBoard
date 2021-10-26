package domaindata;

import javax.persistence.*;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    @OneToOne
    private CommentArea commentArea;

    public Faculty() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommentArea getCommentArea() {
        return commentArea;
    }

    public void setCommentArea(CommentArea commentArea) {
        this.commentArea = commentArea;
    }
}
