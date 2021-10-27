package domaindata;

import com.sun.istack.NotNull;
import users.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Comment extends TextField {



    public Comment() {
        created = LocalDateTime.now();
    }


}
