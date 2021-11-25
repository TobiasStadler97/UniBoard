package UniBoard.entity.domaindata;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Semester {
    /*
    not needed for prototype
     */
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private int period;
    @NotNull
    private int year;

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



}
