package JPA;

import JPA.Component;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Componentcategory.class)
public class Componentcategory_ { 

    public static volatile SingularAttribute<Componentcategory, Integer> idcompcat;
    public static volatile CollectionAttribute<Componentcategory, Component> componentCollection;
    public static volatile SingularAttribute<Componentcategory, String> caractcompcat;
    public static volatile SingularAttribute<Componentcategory, String> namecompcat;
    public static volatile SingularAttribute<Componentcategory, String> desccompcat;
    public static volatile SingularAttribute<Componentcategory, Boolean> statecatcomp;

}