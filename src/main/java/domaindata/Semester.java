package domaindata;

import javax.persistence.*;

@Entity
public class Semester {
    @Id
    @GeneratedValue
    private int id;

    private int period;
    private int year;

    @OneToOne
    private CommentArea commentArea;

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
}
