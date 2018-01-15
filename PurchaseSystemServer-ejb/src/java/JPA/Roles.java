/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roles.findAll", query = "SELECT r FROM Roles r")
    , @NamedQuery(name = "Roles.findByIdrole", query = "SELECT r FROM Roles r WHERE r.idrole = :idrole")
    , @NamedQuery(name = "Roles.findByNamerole", query = "SELECT r FROM Roles r WHERE r.namerole = :namerole")
    , @NamedQuery(name = "Roles.findByDescriptionrole", query = "SELECT r FROM Roles r WHERE r.descriptionrole = :descriptionrole")})
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idrole")
    private Integer idrole;
    @Basic(optional = false)
    @Column(name = "namerole")
    private String namerole;
    @Column(name = "descriptionrole")
    private String descriptionrole;
    @JoinTable(name = "user_roles", joinColumns = {
        @JoinColumn(name = "idrole", referencedColumnName = "idrole")}, inverseJoinColumns = {
        @JoinColumn(name = "idlogin", referencedColumnName = "idlogin")})
    @ManyToMany
    private Collection<Authentication> authenticationCollection;

    public Roles() {
    }

    public Roles(Integer idrole) {
        this.idrole = idrole;
    }

    public Roles(Integer idrole, String namerole) {
        this.idrole = idrole;
        this.namerole = namerole;
    }

    public Integer getIdrole() {
        return idrole;
    }

    public void setIdrole(Integer idrole) {
        this.idrole = idrole;
    }

    public String getNamerole() {
        return namerole;
    }

    public void setNamerole(String namerole) {
        this.namerole = namerole;
    }

    public String getDescriptionrole() {
        return descriptionrole;
    }

    public void setDescriptionrole(String descriptionrole) {
        this.descriptionrole = descriptionrole;
    }

    @XmlTransient
    public Collection<Authentication> getAuthenticationCollection() {
        return authenticationCollection;
    }

    public void setAuthenticationCollection(Collection<Authentication> authenticationCollection) {
        this.authenticationCollection = authenticationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrole != null ? idrole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.idrole == null && other.idrole != null) || (this.idrole != null && !this.idrole.equals(other.idrole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Roles[ idrole=" + idrole + " ]";
    }
    
}
