/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_penonton", catalog = "projectf1", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblPenonton.findAll", query = "SELECT t FROM TblPenonton t")
    , @NamedQuery(name = "TblPenonton.findByIdTicket", query = "SELECT t FROM TblPenonton t WHERE t.idTicket = :idTicket")
    , @NamedQuery(name = "TblPenonton.findByFirstname", query = "SELECT t FROM TblPenonton t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "TblPenonton.findByLastname", query = "SELECT t FROM TblPenonton t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "TblPenonton.findByAge", query = "SELECT t FROM TblPenonton t WHERE t.age = :age")
    , @NamedQuery(name = "TblPenonton.findByCity", query = "SELECT t FROM TblPenonton t WHERE t.city = :city")
    , @NamedQuery(name = "TblPenonton.findByNoPhone", query = "SELECT t FROM TblPenonton t WHERE t.noPhone = :noPhone")})
public class TblPenonton implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_ticket")
    private String idTicket;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "age")
    private String age;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "no_phone")
    private String noPhone;

    public TblPenonton() {
    }

    public TblPenonton(String idTicket) {
        this.idTicket = idTicket;
    }

    public TblPenonton(String idTicket, String firstname, String lastname, String age, String city, String noPhone) {
        this.idTicket = idTicket;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
        this.noPhone = noPhone;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        String oldIdTicket = this.idTicket;
        this.idTicket = idTicket;
        changeSupport.firePropertyChange("idTicket", oldIdTicket, idTicket);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getNoPhone() {
        return noPhone;
    }

    public void setNoPhone(String noPhone) {
        String oldNoPhone = this.noPhone;
        this.noPhone = noPhone;
        changeSupport.firePropertyChange("noPhone", oldNoPhone, noPhone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTicket != null ? idTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPenonton)) {
            return false;
        }
        TblPenonton other = (TblPenonton) object;
        if ((this.idTicket == null && other.idTicket != null) || (this.idTicket != null && !this.idTicket.equals(other.idTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formula.TblPenonton[ idTicket=" + idTicket + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
