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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "proposal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proposal.findAll", query = "SELECT p FROM Proposal p")
    , @NamedQuery(name = "Proposal.findByIdproposal", query = "SELECT p FROM Proposal p WHERE p.idproposal = :idproposal")
    , @NamedQuery(name = "Proposal.findByValueproposal", query = "SELECT p FROM Proposal p WHERE p.valueproposal = :valueproposal")
    , @NamedQuery(name = "Proposal.findByDateproposal", query = "SELECT p FROM Proposal p WHERE p.dateproposal = :dateproposal")
    , @NamedQuery(name = "Proposal.findByRemarksproposal", query = "SELECT p FROM Proposal p WHERE p.remarksproposal = :remarksproposal")
    , @NamedQuery(name = "Proposal.findByIsapproved", query = "SELECT p FROM Proposal p WHERE p.isapproved = :isapproved")})
public class Proposal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idproposal")
    private Integer idproposal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valueproposal")
    private BigDecimal valueproposal;
    @Column(name = "dateproposal")
    @Temporal(TemporalType.DATE)
    private Date dateproposal;
    @Column(name = "remarksproposal")
    private String remarksproposal;
    @Column(name = "isapproved")
    private Boolean isapproved;
    @JoinColumn(name = "idproduct", referencedColumnName = "idproduct")
    @ManyToOne(optional = false)
    private Product idproduct;
    @JoinColumn(name = "idseller", referencedColumnName = "idseller")
    @ManyToOne(optional = false)
    private Seller idseller;
    @OneToMany(mappedBy = "idproposal")
    private Collection<Evaluation> evaluationCollection;

    public Proposal() {
    }

    public Proposal(Integer idproposal) {
        this.idproposal = idproposal;
    }

    public Integer getIdproposal() {
        return idproposal;
    }

    public void setIdproposal(Integer idproposal) {
        this.idproposal = idproposal;
    }

    public BigDecimal getValueproposal() {
        return valueproposal;
    }

    public void setValueproposal(BigDecimal valueproposal) {
        this.valueproposal = valueproposal;
    }

    public Date getDateproposal() {
        return dateproposal;
    }

    public void setDateproposal(Date dateproposal) {
        this.dateproposal = dateproposal;
    }

    public String getRemarksproposal() {
        return remarksproposal;
    }

    public void setRemarksproposal(String remarksproposal) {
        this.remarksproposal = remarksproposal;
    }

    public Boolean getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(Boolean isapproved) {
        this.isapproved = isapproved;
    }

    public Product getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Product idproduct) {
        this.idproduct = idproduct;
    }

    public Seller getIdseller() {
        return idseller;
    }

    public void setIdseller(Seller idseller) {
        this.idseller = idseller;
    }

    @XmlTransient
    public Collection<Evaluation> getEvaluationCollection() {
        return evaluationCollection;
    }

    public void setEvaluationCollection(Collection<Evaluation> evaluationCollection) {
        this.evaluationCollection = evaluationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproposal != null ? idproposal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proposal)) {
            return false;
        }
        Proposal other = (Proposal) object;
        if ((this.idproposal == null && other.idproposal != null) || (this.idproposal != null && !this.idproposal.equals(other.idproposal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Proposal[ idproposal=" + idproposal + " ]";
    }
    
}
