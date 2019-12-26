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
@Table(name = "tbl_pemenang", catalog = "projectf1", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblPemenang.findAll", query = "SELECT t FROM TblPemenang t")
    , @NamedQuery(name = "TblPemenang.findByTicketWin", query = "SELECT t FROM TblPemenang t WHERE t.ticketWin = :ticketWin")
    , @NamedQuery(name = "TblPemenang.findByIdTicket", query = "SELECT t FROM TblPemenang t WHERE t.idTicket = :idTicket")
    , @NamedQuery(name = "TblPemenang.findByTicketColor", query = "SELECT t FROM TblPemenang t WHERE t.ticketColor = :ticketColor")
    , @NamedQuery(name = "TblPemenang.findByFirstname", query = "SELECT t FROM TblPemenang t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "TblPemenang.findByLastname", query = "SELECT t FROM TblPemenang t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "TblPemenang.findByAge", query = "SELECT t FROM TblPemenang t WHERE t.age = :age")
    , @NamedQuery(name = "TblPemenang.findByCity", query = "SELECT t FROM TblPemenang t WHERE t.city = :city")
    , @NamedQuery(name = "TblPemenang.findByNoPhone", query = "SELECT t FROM TblPemenang t WHERE t.noPhone = :noPhone")})
public class TblPemenang implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ticket_win")
    private String ticketWin;
    @Basic(optional = false)
    @Column(name = "id_ticket")
    private String idTicket;
    @Basic(optional = false)
    @Column(name = "ticket_color")
    private String ticketColor;
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

    public TblPemenang() {
    }

    public TblPemenang(String ticketWin) {
        this.ticketWin = ticketWin;
    }

    public TblPemenang(String ticketWin, String idTicket, String ticketColor, String firstname, String lastname, String age, String city, String noPhone) {
        this.ticketWin = ticketWin;
        this.idTicket = idTicket;
        this.ticketColor = ticketColor;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
        this.noPhone = noPhone;
    }

    public String getTicketWin() {
        return ticketWin;
    }

    public void setTicketWin(String ticketWin) {
        String oldTicketWin = this.ticketWin;
        this.ticketWin = ticketWin;
        changeSupport.firePropertyChange("ticketWin", oldTicketWin, ticketWin);
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        String oldIdTicket = this.idTicket;
        this.idTicket = idTicket;
        changeSupport.firePropertyChange("idTicket", oldIdTicket, idTicket);
    }

    public String getTicketColor() {
        return ticketColor;
    }

    public void setTicketColor(String ticketColor) {
        String oldTicketColor = this.ticketColor;
        this.ticketColor = ticketColor;
        changeSupport.firePropertyChange("ticketColor", oldTicketColor, ticketColor);
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
        hash += (ticketWin != null ? ticketWin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPemenang)) {
            return false;
        }
        TblPemenang other = (TblPemenang) object;
        if ((this.ticketWin == null && other.ticketWin != null) || (this.ticketWin != null && !this.ticketWin.equals(other.ticketWin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formula.TblPemenang[ ticketWin=" + ticketWin + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
