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
@Table(name = "seller")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seller.findAll", query = "SELECT s FROM Seller s")
    , @NamedQuery(name = "Seller.findByIdseller", query = "SELECT s FROM Seller s WHERE s.idseller = :idseller")
    , @NamedQuery(name = "Seller.findByNameseller", query = "SELECT s FROM Seller s WHERE s.nameseller = :nameseller")
    , @NamedQuery(name = "Seller.findByCompanysellername", query = "SELECT s FROM Seller s WHERE s.companysellername = :companysellername")
    , @NamedQuery(name = "Seller.findByNifseller", query = "SELECT s FROM Seller s WHERE s.nifseller = :nifseller")
    , @NamedQuery(name = "Seller.findByPhoneseller", query = "SELECT s FROM Seller s WHERE s.phoneseller = :phoneseller")
    , @NamedQuery(name = "Seller.findByFaxseller", query = "SELECT s FROM Seller s WHERE s.faxseller = :faxseller")
    , @NamedQuery(name = "Seller.findByAddressseller", query = "SELECT s FROM Seller s WHERE s.addressseller = :addressseller")
    , @NamedQuery(name = "Seller.findByPostalcodeseller", query = "SELECT s FROM Seller s WHERE s.postalcodeseller = :postalcodeseller")
    , @NamedQuery(name = "Seller.findByNaddressseller", query = "SELECT s FROM Seller s WHERE s.naddressseller = :naddressseller")
    , @NamedQuery(name = "Seller.findByEmailseller", query = "SELECT s FROM Seller s WHERE s.emailseller = :emailseller")
    , @NamedQuery(name = "Seller.findBySellernote", query = "SELECT s FROM Seller s WHERE s.sellernote = :sellernote")})
public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "idseller")
    private Integer idseller;
    @Column(name = "nameseller")
    private String nameseller;
    @Column(name = "companysellername")
    private String companysellername;
    @Column(name = "nifseller")
    private Integer nifseller;
    @Column(name = "phoneseller")
    private String phoneseller;
    @Column(name = "faxseller")
    private String faxseller;
    @Column(name = "addressseller")
    private String addressseller;
    @Column(name = "postalcodeseller")
    private String postalcodeseller;
    @Column(name = "naddressseller")
    private Short naddressseller;
    @Column(name = "emailseller")
    private String emailseller;
    @Column(name = "sellernote")
    private Short sellernote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idseller")
    private Collection<Proposal> proposalCollection;
    @JoinColumn(name = "idlogin", referencedColumnName = "idlogin")
    @ManyToOne(optional = false)
    private Authentication idlogin;

    public Seller() {
    }

    public Seller(Integer idseller) {
        this.idseller = idseller;
    }

    public Integer getIdseller() {
        return idseller;
    }

    public void setIdseller(Integer idseller) {
        this.idseller = idseller;
    }

    public String getNameseller() {
        return nameseller;
    }

    public void setNameseller(String nameseller) {
        this.nameseller = nameseller;
    }

    public String getCompanysellername() {
        return companysellername;
    }

    public void setCompanysellername(String companysellername) {
        this.companysellername = companysellername;
    }

    public Integer getNifseller() {
        return nifseller;
    }

    public void setNifseller(Integer nifseller) {
        this.nifseller = nifseller;
    }

    public String getPhoneseller() {
        return phoneseller;
    }

    public void setPhoneseller(String phoneseller) {
        this.phoneseller = phoneseller;
    }

    public String getFaxseller() {
        return faxseller;
    }

    public void setFaxseller(String faxseller) {
        this.faxseller = faxseller;
    }

    public String getAddressseller() {
        return addressseller;
    }

    public void setAddressseller(String addressseller) {
        this.addressseller = addressseller;
    }

    public String getPostalcodeseller() {
        return postalcodeseller;
    }

    public void setPostalcodeseller(String postalcodeseller) {
        this.postalcodeseller = postalcodeseller;
    }

    public Short getNaddressseller() {
        return naddressseller;
    }

    public void setNaddressseller(Short naddressseller) {
        this.naddressseller = naddressseller;
    }

    public String getEmailseller() {
        return emailseller;
    }

    public void setEmailseller(String emailseller) {
        this.emailseller = emailseller;
    }

    public Short getSellernote() {
        return sellernote;
    }

    public void setSellernote(Short sellernote) {
        this.sellernote = sellernote;
    }

    @XmlTransient
    public Collection<Proposal> getProposalCollection() {
        return proposalCollection;
    }

    public void setProposalCollection(Collection<Proposal> proposalCollection) {
        this.proposalCollection = proposalCollection;
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
        hash += (idseller != null ? idseller.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seller)) {
            return false;
        }
        Seller other = (Seller) object;
        if ((this.idseller == null && other.idseller != null) || (this.idseller != null && !this.idseller.equals(other.idseller))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Seller[ idseller=" + idseller + " ]";
    }
    
}
