package entity.graphic;

import entity.domaindata.Semester;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class SemesterGC extends GraphicalComponent {

    @OneToOne
    private Semester semester;

    public SemesterGC() {
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
