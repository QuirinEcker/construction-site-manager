package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ConstructionSite extends PanacheEntityBase {

    @Id
    Long id;

    @ManyToOne
    Address address;

    public ConstructionSite() {}

    public ConstructionSite(Address address) {
        this.address = address;
    }

    public ConstructionSite(Long id, Address address) {
        this(address);
        this.id = id;
    }

}
