/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jmagalhaes
 */
@Entity
@Table(name = "evaluation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluation.findAll", query = "SELECT e FROM Evaluation e")
    , @NamedQuery(name = "Evaluation.findByIdevaluation", query = "SELECT e FROM Evaluation e WHERE e.idevaluation = :idevaluation")
    , @NamedQuery(name = "Evaluation.findByRemarksevaluation", query = "SELECT e FROM Evaluation e WHERE e.remarksevaluation = :remarksevaluation")
    , @NamedQuery(name = "Evaluation.findByNote", query = "SELECT e FROM Evaluation e WHERE e.note = :note")})
public class Evaluation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idevaluation")
    private Integer idevaluation;
    @Column(name = "remarksevaluation")
    private String remarksevaluation;
    @Column(name = "note")
    private Short note;
    @JoinColumn(name = "idproduct", referencedColumnName = "idproduct")
    @ManyToOne(optional = false)
    private Product idproduct;
    @JoinColumn(name = "idproposal", referencedColumnName = "idproposal")
    @ManyToOne
    private Proposal idproposal;

    public Evaluation() {
    }

    public Evaluation(Integer idevaluation) {
        this.idevaluation = idevaluation;
    }

    public Integer getIdevaluation() {
        return idevaluation;
    }

    public void setIdevaluation(Integer idevaluation) {
        this.idevaluation = idevaluation;
    }

    public String getRemarksevaluation() {
        return remarksevaluation;
    }

    public void setRemarksevaluation(String remarksevaluation) {
        this.remarksevaluation = remarksevaluation;
    }

    public Short getNote() {
        return note;
    }

    public void setNote(Short note) {
        this.note = note;
    }

    public Product getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Product idproduct) {
        this.idproduct = idproduct;
    }

    public Proposal getIdproposal() {
        return idproposal;
    }

    public void setIdproposal(Proposal idproposal) {
        this.idproposal = idproposal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevaluation != null ? idevaluation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluation)) {
            return false;
        }
        Evaluation other = (Evaluation) object;
        if ((this.idevaluation == null && other.idevaluation != null) || (this.idevaluation != null && !this.idevaluation.equals(other.idevaluation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Evaluation[ idevaluation=" + idevaluation + " ]";
    }
    
}
