package JPA;

import JPA.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Productstate.class)
public class Productstate_ { 

    public static volatile SingularAttribute<Productstate, String> descriptionstate;
    public static volatile CollectionAttribute<Productstate, Product> productCollection;
    public static volatile SingularAttribute<Productstate, Integer> idstate;
    public static volatile SingularAttribute<Productstate, String> statename;

}