package JPA;

import JPA.Authentication;
import JPA.Proposal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Seller.class)
public class Seller_ { 

    public static volatile SingularAttribute<Seller, Short> sellernote;
    public static volatile SingularAttribute<Seller, String> phoneseller;
    public static volatile SingularAttribute<Seller, String> postalcodeseller;
    public static volatile SingularAttribute<Seller, String> companysellername;
    public static volatile SingularAttribute<Seller, String> emailseller;
    public static volatile SingularAttribute<Seller, Integer> idseller;
    public static volatile SingularAttribute<Seller, Integer> nifseller;
    public static volatile SingularAttribute<Seller, String> addressseller;
    public static volatile SingularAttribute<Seller, Short> naddressseller;
    public static volatile SingularAttribute<Seller, Authentication> idlogin;
    public static volatile SingularAttribute<Seller, String> nameseller;
    public static volatile SingularAttribute<Seller, String> faxseller;
    public static volatile CollectionAttribute<Seller, Proposal> proposalCollection;

}