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
import javax.persistence.ManyToMany;
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
@Table(name = "authentication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Authentication.findAll", query = "SELECT a FROM Authentication a")
    , @NamedQuery(name = "Authentication.findByIdlogin", query = "SELECT a FROM Authentication a WHERE a.idlogin = :idlogin")
    , @NamedQuery(name = "Authentication.findByUsername", query = "SELECT a FROM Authentication a WHERE a.username = :username")
    , @NamedQuery(name = "Authentication.findByPassword", query = "SELECT a FROM Authentication a WHERE a.password = :password")
    , @NamedQuery(name = "Authentication.logCheck", query = "SELECT A FROM Authentication a WHERE a.username= :username AND a.password= :password AND a.isactivate=true")   
    , @NamedQuery(name = "Authentication.findByIsactivate", query = "SELECT a FROM Authentication a WHERE a.isactivate = :isactivate")})
public class Authentication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idlogin")
    private Integer idlogin;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "isactivate")
    private Boolean isactivate;
    @ManyToMany(mappedBy = "authenticationCollection")
    private Collection<Roles> rolesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idlogin")
    private Collection<Seller> sellerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idlogin")
    private Collection<Users> usersCollection;

    public Authentication() {
    }

    public Authentication(Integer idlogin) {
        this.idlogin = idlogin;
    }

    public Authentication(Integer idlogin, String username, String password) {
        this.idlogin = idlogin;
        this.username = username;
        this.password = password;
    }

    public Integer getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(Integer idlogin) {
        this.idlogin = idlogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsactivate() {
        return isactivate;
    }

    public void setIsactivate(Boolean isactivate) {
        this.isactivate = isactivate;
    }

    @XmlTransient
    public Collection<Roles> getRolesCollection() {
        return rolesCollection;
    }

    public void setRolesCollection(Collection<Roles> rolesCollection) {
        this.rolesCollection = rolesCollection;
    }

    @XmlTransient
    public Collection<Seller> getSellerCollection() {
        return sellerCollection;
    }

    public void setSellerCollection(Collection<Seller> sellerCollection) {
        this.sellerCollection = sellerCollection;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlogin != null ? idlogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Authentication)) {
            return false;
        }
        Authentication other = (Authentication) object;
        if ((this.idlogin == null && other.idlogin != null) || (this.idlogin != null && !this.idlogin.equals(other.idlogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Authentication[ idlogin=" + idlogin + " ]";
    }
    
}
