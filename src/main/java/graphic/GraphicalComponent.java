package graphic;

import javax.persistence.*;

@MappedSuperclass
@Entity // do you still need entity if you use the mapped superclass inheritance?
public abstract class GraphicalComponent {
    @Id
    @GeneratedValue
    private int id;

    private int positionX;
    private int positionY;
    private int order;

    @OneToOne
    private GraphicalComponent parent;
}
