package JPA;

import JPA.Product;
import JPA.Proposal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-15T22:31:00")
@StaticMetamodel(Evaluation.class)
public class Evaluation_ { 

    public static volatile SingularAttribute<Evaluation, Product> idproduct;
    public static volatile SingularAttribute<Evaluation, Proposal> idproposal;
    public static volatile SingularAttribute<Evaluation, Short> note;
    public static volatile SingularAttribute<Evaluation, String> remarksevaluation;
    public static volatile SingularAttribute<Evaluation, Integer> idevaluation;

}