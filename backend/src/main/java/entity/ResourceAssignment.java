package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ResourceAssignment extends PanacheEntityBase {

    @Id
    Long id;

    @ManyToOne
    Resource resource;

    @ManyToOne
    ConstructionSite constructionSite;

    double timeCostInHour;

    public ResourceAssignment() { }

    public ResourceAssignment(double timeCostInHour) {
        this.timeCostInHour = timeCostInHour;
    }

    public ResourceAssignment(
            Resource resource,
            ConstructionSite constructionSite,
            double timeCostInHour
    ) {
        this(timeCostInHour);
        this.resource = resource;
        this.constructionSite = constructionSite;
    }

    public ResourceAssignment(
            Long id,
            Resource resource,
            ConstructionSite constructionSite,
            double timeCostInHour
    ) {
        this(resource, constructionSite, timeCostInHour);
        this.id = id;
    }

}
