package JPA;

import JPA.Evaluation;
import JPA.Product;
import JPA.Seller;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Proposal.class)
public class Proposal_ { 

    public static volatile SingularAttribute<Proposal, Integer> idproposal;
    public static volatile SingularAttribute<Proposal, Product> idproduct;
    public static volatile SingularAttribute<Proposal, BigDecimal> valueproposal;
    public static volatile SingularAttribute<Proposal, Boolean> isapproved;
    public static volatile SingularAttribute<Proposal, Seller> idseller;
    public static volatile SingularAttribute<Proposal, Date> dateproposal;
    public static volatile CollectionAttribute<Proposal, Evaluation> evaluationCollection;
    public static volatile SingularAttribute<Proposal, String> remarksproposal;

}