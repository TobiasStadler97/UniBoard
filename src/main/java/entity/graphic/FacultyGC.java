package entity.graphic;

import entity.domaindata.Faculty;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class FacultyGC extends GraphicalComponent {

    @OneToOne
    private Faculty faculty;

    public FacultyGC() {
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
