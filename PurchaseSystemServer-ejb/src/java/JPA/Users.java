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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByIduser", query = "SELECT u FROM Users u WHERE u.iduser = :iduser")
    , @NamedQuery(name = "Users.findByNameuser", query = "SELECT u FROM Users u WHERE u.nameuser = :nameuser")
    , @NamedQuery(name = "Users.findBySurnameuser", query = "SELECT u FROM Users u WHERE u.surnameuser = :surnameuser")
    , @NamedQuery(name = "Users.findByEmailuser", query = "SELECT u FROM Users u WHERE u.emailuser = :emailuser")
    , @NamedQuery(name = "Users.findByNifuser", query = "SELECT u FROM Users u WHERE u.nifuser = :nifuser")
    , @NamedQuery(name = "Users.findByBiuser", query = "SELECT u FROM Users u WHERE u.biuser = :biuser")
    , @NamedQuery(name = "Users.findByAddressuser", query = "SELECT u FROM Users u WHERE u.addressuser = :addressuser")
    , @NamedQuery(name = "Users.findByPostalcodeuser", query = "SELECT u FROM Users u WHERE u.postalcodeuser = :postalcodeuser")
    , @NamedQuery(name = "Users.findByNaddressuser", query = "SELECT u FROM Users u WHERE u.naddressuser = :naddressuser")
    , @NamedQuery(name = "Users.findByPhoneuser", query = "SELECT u FROM Users u WHERE u.phoneuser = :phoneuser")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "iduser")
    private Integer iduser;
    @Column(name = "nameuser")
    private String nameuser;
    @Column(name = "surnameuser")
    private String surnameuser;
    @Column(name = "emailuser")
    private String emailuser;
    @Column(name = "nifuser")
    private Integer nifuser;
    @Column(name = "biuser")
    private String biuser;
    @Column(name = "addressuser")
    private String addressuser;
    @Column(name = "postalcodeuser")
    private String postalcodeuser;
    @Column(name = "naddressuser")
    private Short naddressuser;
    @Column(name = "phoneuser")
    private String phoneuser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iduser")
    private Collection<Product> productCollection;
    @JoinColumn(name = "idlogin", referencedColumnName = "idlogin")
    @ManyToOne(optional = false)
    private Authentication idlogin;

    public Users() {
    }

    public Users(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getSurnameuser() {
        return surnameuser;
    }

    public void setSurnameuser(String surnameuser) {
        this.surnameuser = surnameuser;
    }

    public String getEmailuser() {
        return emailuser;
    }

    public void setEmailuser(String emailuser) {
        this.emailuser = emailuser;
    }

    public Integer getNifuser() {
        return nifuser;
    }

    public void setNifuser(Integer nifuser) {
        this.nifuser = nifuser;
    }

    public String getBiuser() {
        return biuser;
    }

    public void setBiuser(String biuser) {
        this.biuser = biuser;
    }

    public String getAddressuser() {
        return addressuser;
    }

    public void setAddressuser(String addressuser) {
        this.addressuser = addressuser;
    }

    public String getPostalcodeuser() {
        return postalcodeuser;
    }

    public void setPostalcodeuser(String postalcodeuser) {
        this.postalcodeuser = postalcodeuser;
    }

    public Short getNaddressuser() {
        return naddressuser;
    }

    public void setNaddressuser(Short naddressuser) {
        this.naddressuser = naddressuser;
    }

    public String getPhoneuser() {
        return phoneuser;
    }

    public void setPhoneuser(String phoneuser) {
        this.phoneuser = phoneuser;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    public Authentication getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(Authentication idlogin) {
        this.idlogin = idlogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Users[ iduser=" + iduser + " ]";
    }
    
}
