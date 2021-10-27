package entity.domaindata;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Comment extends TextField {

    public Comment() {
        created = LocalDateTime.now();
    }


}
