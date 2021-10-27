package entity.users;

import javax.persistence.*;

@MappedSuperclass
@Entity // do you still need entity if you use the mapped superclass inheritance?
public abstract class Person {

    String firstName;
    String lastName;
    String uniID; // could be neptun ID but I want to keep it general

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // could also use uniID instead of own id


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
