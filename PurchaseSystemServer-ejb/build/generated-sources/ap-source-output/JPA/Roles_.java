package JPA;

import JPA.Authentication;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> idrole;
    public static volatile SingularAttribute<Roles, String> descriptionrole;
    public static volatile SingularAttribute<Roles, String> namerole;
    public static volatile CollectionAttribute<Roles, Authentication> authenticationCollection;

}