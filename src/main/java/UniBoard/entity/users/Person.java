package UniBoard.entity.users;

import javax.persistence.*;

@Entity
@MappedSuperclass
public abstract class Person {

    String firstName;
    String lastName;
    String uniID; // could be neptun ID but I want to keep it general

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // faculty
    // password


    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniID() {
        return uniID;
    }

    public int getId() {
        return id;
    }
}
