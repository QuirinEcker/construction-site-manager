package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model extends PanacheEntityBase {

    @Id
    Long id;

    String brand;

    String name;

    int year;

    public Model() { }

    public Model(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    public Model(Long id, String brand, String name, int year) {
        this(brand, name, year);
        this.id = id;
    }

}
