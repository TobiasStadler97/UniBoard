package UniBoard.entity.graphic;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class GraphicalComponent {
    @Id
    @GeneratedValue
    private int id;

    private int positionX;
    private int positionY;
    private int order;

    @OneToOne
    private GraphicalComponent parent;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }
}
