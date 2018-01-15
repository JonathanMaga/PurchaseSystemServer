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
@Table(name = "productcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productcategory.findAll", query = "SELECT p FROM Productcategory p")
    , @NamedQuery(name = "Productcategory.findByIdcatproduct", query = "SELECT p FROM Productcategory p WHERE p.idcatproduct = :idcatproduct")
    , @NamedQuery(name = "Productcategory.findByNamecatproduct", query = "SELECT p FROM Productcategory p WHERE p.namecatproduct = :namecatproduct")
    , @NamedQuery(name = "Productcategory.findByDescriptioncatproduct", query = "SELECT p FROM Productcategory p WHERE p.descriptioncatproduct = :descriptioncatproduct")
    , @NamedQuery(name = "Productcategory.findByStatecategory", query = "SELECT p FROM Productcategory p WHERE p.statecategory = :statecategory")})
public class Productcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idcatproduct")
    private Integer idcatproduct;
    @Column(name = "namecatproduct")
    private String namecatproduct;
    @Column(name = "descriptioncatproduct")
    private String descriptioncatproduct;
    @Column(name = "statecategory")
    private Boolean statecategory;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcatproduct")
    private Collection<Product> productCollection;

    public Productcategory() {
    }

    public Productcategory(Integer idcatproduct) {
        this.idcatproduct = idcatproduct;
    }

    public Integer getIdcatproduct() {
        return idcatproduct;
    }

    public void setIdcatproduct(Integer idcatproduct) {
        this.idcatproduct = idcatproduct;
    }

    public String getNamecatproduct() {
        return namecatproduct;
    }

    public void setNamecatproduct(String namecatproduct) {
        this.namecatproduct = namecatproduct;
    }

    public String getDescriptioncatproduct() {
        return descriptioncatproduct;
    }

    public void setDescriptioncatproduct(String descriptioncatproduct) {
        this.descriptioncatproduct = descriptioncatproduct;
    }

    public Boolean getStatecategory() {
        return statecategory;
    }

    public void setStatecategory(Boolean statecategory) {
        this.statecategory = statecategory;
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
        hash += (idcatproduct != null ? idcatproduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productcategory)) {
            return false;
        }
        Productcategory other = (Productcategory) object;
        if ((this.idcatproduct == null && other.idcatproduct != null) || (this.idcatproduct != null && !this.idcatproduct.equals(other.idcatproduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Productcategory[ idcatproduct=" + idcatproduct + " ]";
    }
    
}
