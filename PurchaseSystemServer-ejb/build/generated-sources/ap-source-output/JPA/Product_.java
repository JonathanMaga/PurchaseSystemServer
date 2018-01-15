package JPA;

import JPA.Component;
import JPA.Evaluation;
import JPA.Productcategory;
import JPA.Productstate;
import JPA.Proposal;
import JPA.Users;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> idproduct;
    public static volatile SingularAttribute<Product, Date> creationdate;
    public static volatile SingularAttribute<Product, Short> productnote;
    public static volatile SingularAttribute<Product, Users> iduser;
    public static volatile SingularAttribute<Product, String> nameproduct;
    public static volatile SingularAttribute<Product, String> descriptionproduct;
    public static volatile SingularAttribute<Product, Date> deadlineexecution;
    public static volatile SingularAttribute<Product, Date> deadlineproposal;
    public static volatile SingularAttribute<Product, Productcategory> idcatproduct;
    public static volatile CollectionAttribute<Product, Evaluation> evaluationCollection;
    public static volatile SingularAttribute<Product, Productstate> idstate;
    public static volatile CollectionAttribute<Product, Component> componentCollection;
    public static volatile SingularAttribute<Product, Date> conclusiondate;
    public static volatile SingularAttribute<Product, String> remarksproduct;
    public static volatile SingularAttribute<Product, BigDecimal> producmaxtvalue;
    public static volatile CollectionAttribute<Product, Proposal> proposalCollection;

}