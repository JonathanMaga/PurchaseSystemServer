/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jmagalhaes
 */
@Entity
@Table(name = "component")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Component.findAll", query = "SELECT c FROM Component c")
    , @NamedQuery(name = "Component.findByIdcomponent", query = "SELECT c FROM Component c WHERE c.idcomponent = :idcomponent")
    , @NamedQuery(name = "Component.findByNamecomponent", query = "SELECT c FROM Component c WHERE c.namecomponent = :namecomponent")
    , @NamedQuery(name = "Component.findByValuecaract", query = "SELECT c FROM Component c WHERE c.valuecaract = :valuecaract")
    , @NamedQuery(name = "Component.findByOperator", query = "SELECT c FROM Component c WHERE c.operator = :operator")
    , @NamedQuery(name = "Component.findByCaractcomp", query = "SELECT c FROM Component c WHERE c.caractcomp = :caractcomp")})
public class Component implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idcomponent")
    private Integer idcomponent;
    @Column(name = "namecomponent")
    private String namecomponent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valuecaract")
    private BigDecimal valuecaract;
    @Column(name = "operator")
    private String operator;
    @Column(name = "caractcomp")
    private String caractcomp;
    @JoinTable(name = "product_component", joinColumns = {
        @JoinColumn(name = "idcomponent", referencedColumnName = "idcomponent")}, inverseJoinColumns = {
        @JoinColumn(name = "idproduct", referencedColumnName = "idproduct")})
    @ManyToMany
    private Collection<Product> productCollection;
    @JoinColumn(name = "idcompcat", referencedColumnName = "idcompcat")
    @ManyToOne(optional = false)
    private Componentcategory idcompcat;

    public Component() {
    }

    public Component(Integer idcomponent) {
        this.idcomponent = idcomponent;
    }

    public Integer getIdcomponent() {
        return idcomponent;
    }

    public void setIdcomponent(Integer idcomponent) {
        this.idcomponent = idcomponent;
    }

    public String getNamecomponent() {
        return namecomponent;
    }

    public void setNamecomponent(String namecomponent) {
        this.namecomponent = namecomponent;
    }

    public BigDecimal getValuecaract() {
        return valuecaract;
    }

    public void setValuecaract(BigDecimal valuecaract) {
        this.valuecaract = valuecaract;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCaractcomp() {
        return caractcomp;
    }

    public void setCaractcomp(String caractcomp) {
        this.caractcomp = caractcomp;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    public Componentcategory getIdcompcat() {
        return idcompcat;
    }

    public void setIdcompcat(Componentcategory idcompcat) {
        this.idcompcat = idcompcat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomponent != null ? idcomponent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Component)) {
            return false;
        }
        Component other = (Component) object;
        if ((this.idcomponent == null && other.idcomponent != null) || (this.idcomponent != null && !this.idcomponent.equals(other.idcomponent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Component[ idcomponent=" + idcomponent + " ]";
    }
    
}
