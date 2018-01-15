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
@Table(name = "componentcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Componentcategory.findAll", query = "SELECT c FROM Componentcategory c")
    , @NamedQuery(name = "Componentcategory.findByIdcompcat", query = "SELECT c FROM Componentcategory c WHERE c.idcompcat = :idcompcat")
    , @NamedQuery(name = "Componentcategory.findByDesccompcat", query = "SELECT c FROM Componentcategory c WHERE c.desccompcat = :desccompcat")
    , @NamedQuery(name = "Componentcategory.findByNamecompcat", query = "SELECT c FROM Componentcategory c WHERE c.namecompcat = :namecompcat")
    , @NamedQuery(name = "Componentcategory.findByCaractcompcat", query = "SELECT c FROM Componentcategory c WHERE c.caractcompcat = :caractcompcat")
    , @NamedQuery(name = "Componentcategory.findByStatecatcomp", query = "SELECT c FROM Componentcategory c WHERE c.statecatcomp = :statecatcomp")})
public class Componentcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idcompcat")
    private Integer idcompcat;
    @Column(name = "desccompcat")
    private String desccompcat;
    @Column(name = "namecompcat")
    private String namecompcat;
    @Column(name = "caractcompcat")
    private String caractcompcat;
    @Column(name = "statecatcomp")
    private Boolean statecatcomp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcompcat")
    private Collection<Component> componentCollection;

    public Componentcategory() {
    }

    public Componentcategory(Integer idcompcat) {
        this.idcompcat = idcompcat;
    }

    public Integer getIdcompcat() {
        return idcompcat;
    }

    public void setIdcompcat(Integer idcompcat) {
        this.idcompcat = idcompcat;
    }

    public String getDesccompcat() {
        return desccompcat;
    }

    public void setDesccompcat(String desccompcat) {
        this.desccompcat = desccompcat;
    }

    public String getNamecompcat() {
        return namecompcat;
    }

    public void setNamecompcat(String namecompcat) {
        this.namecompcat = namecompcat;
    }

    public String getCaractcompcat() {
        return caractcompcat;
    }

    public void setCaractcompcat(String caractcompcat) {
        this.caractcompcat = caractcompcat;
    }

    public Boolean getStatecatcomp() {
        return statecatcomp;
    }

    public void setStatecatcomp(Boolean statecatcomp) {
        this.statecatcomp = statecatcomp;
    }

    @XmlTransient
    public Collection<Component> getComponentCollection() {
        return componentCollection;
    }

    public void setComponentCollection(Collection<Component> componentCollection) {
        this.componentCollection = componentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcompcat != null ? idcompcat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componentcategory)) {
            return false;
        }
        Componentcategory other = (Componentcategory) object;
        if ((this.idcompcat == null && other.idcompcat != null) || (this.idcompcat != null && !this.idcompcat.equals(other.idcompcat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Componentcategory[ idcompcat=" + idcompcat + " ]";
    }
    
}
