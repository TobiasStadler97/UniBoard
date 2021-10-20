package graphic;

import javax.persistence.*;

@Entity
public class GraphicalComponent {
    @Id
    @GeneratedValue
    private int id;

    private int positionX;
    private int positionY;
    private int order;

    @OneToOne
    private GraphicalComponent parent;
}
