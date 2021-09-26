package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address extends PanacheEntityBase {

    @Id
    Long id;

    String place;

    String street;

    int streetNo;

    int zib;

    public Address(Long id, String place, String street, int streetNo, int zib) {
        this(place, street, streetNo, zib);
        this.id = id;

    }

    public Address(String place, String street, int streetNo, int zib) {
        this.place = place;
        this.street = street;
        this.streetNo = streetNo;
        this.zib = zib;
    }

    public Address() { }
}
