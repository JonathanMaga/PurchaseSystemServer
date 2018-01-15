package JPA;

import JPA.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Productcategory.class)
public class Productcategory_ { 

    public static volatile SingularAttribute<Productcategory, Boolean> statecategory;
    public static volatile CollectionAttribute<Productcategory, Product> productCollection;
    public static volatile SingularAttribute<Productcategory, Integer> idcatproduct;
    public static volatile SingularAttribute<Productcategory, String> descriptioncatproduct;
    public static volatile SingularAttribute<Productcategory, String> namecatproduct;

}