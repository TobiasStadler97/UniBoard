package domaindata;

import com.sun.istack.NotNull;
import graphic.SemesterGC;

import javax.persistence.*;

@Entity
public class Semester {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private int period;
    @NotNull
    private int year;

    @OneToOne
    private SemesterGC semesterGC;

    @OneToOne
    private CommentArea commentArea;

    public Semester() {
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public SemesterGC getSemesterGC() {
        return semesterGC;
    }

    public CommentArea getCommentArea() {
        return commentArea;
    }

    public void setSemesterGC(SemesterGC semesterGC) {
        this.semesterGC = semesterGC;
    }

    public void setCommentArea(CommentArea commentArea) {
        this.commentArea = commentArea;
    }
}
