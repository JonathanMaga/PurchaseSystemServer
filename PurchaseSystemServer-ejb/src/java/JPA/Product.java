/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jmagalhaes
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByIdproduct", query = "SELECT p FROM Product p WHERE p.idproduct = :idproduct")
    , @NamedQuery(name = "Product.findByNameproduct", query = "SELECT p FROM Product p WHERE p.nameproduct = :nameproduct")
    , @NamedQuery(name = "Product.findByDescriptionproduct", query = "SELECT p FROM Product p WHERE p.descriptionproduct = :descriptionproduct")
    , @NamedQuery(name = "Product.findByRemarksproduct", query = "SELECT p FROM Product p WHERE p.remarksproduct = :remarksproduct")
    , @NamedQuery(name = "Product.findByDeadlineexecution", query = "SELECT p FROM Product p WHERE p.deadlineexecution = :deadlineexecution")
    , @NamedQuery(name = "Product.findByDeadlineproposal", query = "SELECT p FROM Product p WHERE p.deadlineproposal = :deadlineproposal")
    , @NamedQuery(name = "Product.findByCreationdate", query = "SELECT p FROM Product p WHERE p.creationdate = :creationdate")
    , @NamedQuery(name = "Product.findByConclusiondate", query = "SELECT p FROM Product p WHERE p.conclusiondate = :conclusiondate")
    , @NamedQuery(name = "Product.findByProducmaxtvalue", query = "SELECT p FROM Product p WHERE p.producmaxtvalue = :producmaxtvalue")
    , @NamedQuery(name = "Product.findByProductnote", query = "SELECT p FROM Product p WHERE p.productnote = :productnote")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idproduct")
    private Integer idproduct;
    @Column(name = "nameproduct")
    private String nameproduct;
    @Column(name = "descriptionproduct")
    private String descriptionproduct;
    @Column(name = "remarksproduct")
    private String remarksproduct;
    @Column(name = "deadlineexecution")
    @Temporal(TemporalType.DATE)
    private Date deadlineexecution;
    @Column(name = "deadlineproposal")
    @Temporal(TemporalType.DATE)
    private Date deadlineproposal;
    @Column(name = "creationdate")
    @Temporal(TemporalType.DATE)
    private Date creationdate;
    @Column(name = "conclusiondate")
    @Temporal(TemporalType.DATE)
    private Date conclusiondate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "producmaxtvalue")
    private BigDecimal producmaxtvalue;
    @Column(name = "productnote")
    private Short productnote;
    @ManyToMany(mappedBy = "productCollection")
    private Collection<Component> componentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproduct")
    private Collection<Proposal> proposalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproduct")
    private Collection<Evaluation> evaluationCollection;
    @JoinColumn(name = "idcatproduct", referencedColumnName = "idcatproduct")
    @ManyToOne(optional = false)
    private Productcategory idcatproduct;
    @JoinColumn(name = "idstate", referencedColumnName = "idstate")
    @ManyToOne(optional = false)
    private Productstate idstate;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne(optional = false)
    private Users iduser;

    public Product() {
    }

    public Product(Integer idproduct) {
        this.idproduct = idproduct;
    }

    public Integer getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Integer idproduct) {
        this.idproduct = idproduct;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public String getDescriptionproduct() {
        return descriptionproduct;
    }

    public void setDescriptionproduct(String descriptionproduct) {
        this.descriptionproduct = descriptionproduct;
    }

    public String getRemarksproduct() {
        return remarksproduct;
    }

    public void setRemarksproduct(String remarksproduct) {
        this.remarksproduct = remarksproduct;
    }

    public Date getDeadlineexecution() {
        return deadlineexecution;
    }

    public void setDeadlineexecution(Date deadlineexecution) {
        this.deadlineexecution = deadlineexecution;
    }

    public Date getDeadlineproposal() {
        return deadlineproposal;
    }

    public void setDeadlineproposal(Date deadlineproposal) {
        this.deadlineproposal = deadlineproposal;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getConclusiondate() {
        return conclusiondate;
    }

    public void setConclusiondate(Date conclusiondate) {
        this.conclusiondate = conclusiondate;
    }

    public BigDecimal getProducmaxtvalue() {
        return producmaxtvalue;
    }

    public void setProducmaxtvalue(BigDecimal producmaxtvalue) {
        this.producmaxtvalue = producmaxtvalue;
    }

    public Short getProductnote() {
        return productnote;
    }

    public void setProductnote(Short productnote) {
        this.productnote = productnote;
    }

    @XmlTransient
    public Collection<Component> getComponentCollection() {
        return componentCollection;
    }

    public void setComponentCollection(Collection<Component> componentCollection) {
        this.componentCollection = componentCollection;
    }

    @XmlTransient
    public Collection<Proposal> getProposalCollection() {
        return proposalCollection;
    }

    public void setProposalCollection(Collection<Proposal> proposalCollection) {
        this.proposalCollection = proposalCollection;
    }

    @XmlTransient
    public Collection<Evaluation> getEvaluationCollection() {
        return evaluationCollection;
    }

    public void setEvaluationCollection(Collection<Evaluation> evaluationCollection) {
        this.evaluationCollection = evaluationCollection;
    }

    public Productcategory getIdcatproduct() {
        return idcatproduct;
    }

    public void setIdcatproduct(Productcategory idcatproduct) {
        this.idcatproduct = idcatproduct;
    }

    public Productstate getIdstate() {
        return idstate;
    }

    public void setIdstate(Productstate idstate) {
        this.idstate = idstate;
    }

    public Users getIduser() {
        return iduser;
    }

    public void setIduser(Users iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduct != null ? idproduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idproduct == null && other.idproduct != null) || (this.idproduct != null && !this.idproduct.equals(other.idproduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Product[ idproduct=" + idproduct + " ]";
    }
    
}
