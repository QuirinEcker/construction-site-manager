package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resource {

    @Id
    Long id;

    double costPerHour;

    public Resource(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public Resource(Long id, double costPerHour) {
        this.id = id;
        this.costPerHour = costPerHour;
    }

    public Resource() {}

}
