package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Resource extends PanacheEntityBase {

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
