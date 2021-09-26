package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle extends PanacheEntityBase {

    @Id
    Long id;

    @ManyToOne
    Model model;

    int age;

    String notice;

    public Vehicle() {}

    public Vehicle(int age, String notice) {
        this.age = age;
        this.notice = notice;
    }

    public Vehicle(Model model, int age, String notice) {
        this(age, notice);
        this.model = model;
    }

    public Vehicle(Long id, Model model, int age, String notice) {
        this(model, age, notice);
        this.id = id;
    }

}
