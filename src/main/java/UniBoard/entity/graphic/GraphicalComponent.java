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
    private int orderNr;

    //@OneToOne
    //private GraphicalComponent parent; // why is this attribute here

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

    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int order) {
        this.orderNr = order;
    }

    public int getId() {
        return id;
    }
}
