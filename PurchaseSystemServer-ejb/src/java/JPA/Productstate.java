/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jmagalhaes
 */
@Entity
@Table(name = "productstate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productstate.findAll", query = "SELECT p FROM Productstate p")
    , @NamedQuery(name = "Productstate.findByIdstate", query = "SELECT p FROM Productstate p WHERE p.idstate = :idstate")
    , @NamedQuery(name = "Productstate.findByStatename", query = "SELECT p FROM Productstate p WHERE p.statename = :statename")
    , @NamedQuery(name = "Productstate.findByDescriptionstate", query = "SELECT p FROM Productstate p WHERE p.descriptionstate = :descriptionstate")})
public class Productstate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idstate")
    private Integer idstate;
    @Column(name = "statename")
    private String statename;
    @Column(name = "descriptionstate")
    private String descriptionstate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idstate")
    private Collection<Product> productCollection;

    public Productstate() {
    }

    public Productstate(Integer idstate) {
        this.idstate = idstate;
    }

    public Integer getIdstate() {
        return idstate;
    }

    public void setIdstate(Integer idstate) {
        this.idstate = idstate;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getDescriptionstate() {
        return descriptionstate;
    }

    public void setDescriptionstate(String descriptionstate) {
        this.descriptionstate = descriptionstate;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstate != null ? idstate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productstate)) {
            return false;
        }
        Productstate other = (Productstate) object;
        if ((this.idstate == null && other.idstate != null) || (this.idstate != null && !this.idstate.equals(other.idstate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Productstate[ idstate=" + idstate + " ]";
    }
    
}
