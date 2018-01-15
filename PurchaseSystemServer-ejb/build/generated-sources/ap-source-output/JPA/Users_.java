package JPA;

import JPA.Authentication;
import JPA.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> phoneuser;
    public static volatile SingularAttribute<Users, Integer> iduser;
    public static volatile SingularAttribute<Users, String> nameuser;
    public static volatile CollectionAttribute<Users, Product> productCollection;
    public static volatile SingularAttribute<Users, String> emailuser;
    public static volatile SingularAttribute<Users, Authentication> idlogin;
    public static volatile SingularAttribute<Users, String> addressuser;
    public static volatile SingularAttribute<Users, String> postalcodeuser;
    public static volatile SingularAttribute<Users, Integer> nifuser;
    public static volatile SingularAttribute<Users, String> biuser;
    public static volatile SingularAttribute<Users, String> surnameuser;
    public static volatile SingularAttribute<Users, Short> naddressuser;

}