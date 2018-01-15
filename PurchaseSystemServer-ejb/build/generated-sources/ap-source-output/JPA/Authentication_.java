package JPA;

import JPA.Roles;
import JPA.Seller;
import JPA.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Authentication.class)
public class Authentication_ { 

    public static volatile SingularAttribute<Authentication, String> password;
    public static volatile SingularAttribute<Authentication, Boolean> isactivate;
    public static volatile SingularAttribute<Authentication, Integer> idlogin;
    public static volatile CollectionAttribute<Authentication, Seller> sellerCollection;
    public static volatile CollectionAttribute<Authentication, Roles> rolesCollection;
    public static volatile CollectionAttribute<Authentication, Users> usersCollection;
    public static volatile SingularAttribute<Authentication, String> username;

}