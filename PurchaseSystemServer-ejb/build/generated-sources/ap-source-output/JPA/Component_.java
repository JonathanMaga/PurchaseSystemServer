package JPA;

import JPA.Componentcategory;
import JPA.Product;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Component.class)
public class Component_ { 

    public static volatile SingularAttribute<Component, Componentcategory> idcompcat;
    public static volatile CollectionAttribute<Component, Product> productCollection;
    public static volatile SingularAttribute<Component, String> caractcomp;
    public static volatile SingularAttribute<Component, String> namecomponent;
    public static volatile SingularAttribute<Component, BigDecimal> valuecaract;
    public static volatile SingularAttribute<Component, Integer> idcomponent;
    public static volatile SingularAttribute<Component, String> operator;

}