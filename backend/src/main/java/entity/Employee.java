package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Employee extends Resource {

    String firstname;

    String lastname;

    int svn;

    @ManyToOne
    Address address;

    public Employee(Long id, String firstname, String lastname, int svn, Address address) {
        this(firstname, lastname, svn, address);
        this.id = id;
    }

    public Employee(String firstname, String lastname, int svn, Address address) {
        this(firstname, lastname, svn);
        this.address = address;
    }

    public Employee(String firstname, String lastname, int svn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.svn = svn;
    }

    public Employee() { }

}
