package entity.domaindata;

import entity.graphic.FacultyGC;

import javax.persistence.*;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne
    private CommentArea commentArea;

    @OneToOne
    private FacultyGC facultyGC;

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

    public FacultyGC getFacultyGC() {
        return facultyGC;
    }

    public void setFacultyGC(FacultyGC facultyGC) {
        this.facultyGC = facultyGC;
    }

    public int getId() {
        return id;
    }
}
