package UniBoard.entity.domaindata;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Comment extends TextField {

    /*
    content
    date
    id
    issuer
    discussion_id
     */

    public Comment() {
        created = LocalDateTime.now();
    }


}
